package mutual_stream_api;

import java.util.ArrayList;
import java.util.List;

class Resource_1 {
	List<Integer> list = new ArrayList<>();

	public synchronized void Addingno() throws InterruptedException {
		int count = 1;
		System.out.println("Adding the elements : ");
		while (list.size() <= 10) {
			System.out.println("Adding the Elements = ➕ " + list.size());
			list.add(count);
			count++;
		}
		System.out.println("List Limt is Full .....");
	}

	public synchronized void Remono() throws InterruptedException {
		
		Thread.sleep(1000);
		
		if (list.size() == 0) {
			 
			System.out.println("Removing Elements....!");
		} else {
			int reomiver = list.remove(0);
			System.out.println("Removieng ELements : " + reomiver);
		}
		 
	}

}

class Produce extends Thread {
	Resource_1 voice;

	public void run() {
		try {
			voice.Addingno();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Conseder extends Thread {
	Resource_1 voice;

	public void run() {
		try {
			voice.Remono();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Mutual_3 {

	public static void main(String[] args) {

		Resource_1 obj = new Resource_1();

		Produce fi = new Produce();

		Conseder se = new Conseder();

		fi.voice = obj;
		se.voice = obj;

		fi.start();
		se.start();

	}

}