package mutual_stream_api;

import java.util.ArrayList;
import java.util.List;

class Deadsources {

	List<Integer> list = new ArrayList<>();

	int count = 0;

	public synchronized void Addnum() throws InterruptedException {
		if (list.size() == 10) {
			System.out.println("List Full... Producer waiting");
			wait();
		}
		list.add(count);
		count++;
		System.out.println("Add Number : " + count);
		notify(); // notify producer
		Thread.sleep(1000);
	}

	public synchronized void Removenum() throws InterruptedException {
		if (list.size() == 0) {
			System.out.println("List Empty... Consumer waiting");
			wait();
		}
		int re_list = list.remove(0);
		System.out.println("Remove's Elements : " + re_list);
		notify(); // notify producer
		Thread.sleep(2000);
	}
}

class Prodeuced extends Thread {
	Deadsources filp;

	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				filp.Addnum();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Conjumer extends Thread {
	Deadsources filp;

	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				filp.Removenum();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Mutual_6 {

	public static void main(String[] args) {

		Deadsources object = new Deadsources();

		Prodeuced pahila = new Prodeuced();
		Conjumer dusra = new Conjumer();

		pahila.filp = object;
		dusra.filp = object;

		pahila.start();
		dusra.start();
	}

}
