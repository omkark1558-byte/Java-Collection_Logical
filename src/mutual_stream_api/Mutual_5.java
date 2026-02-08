package mutual_stream_api;

import java.util.ArrayList;
import java.util.List;

public class Mutual_5 {

	public static void main(String[] args) {

		Sourcess Obj = new Sourcess();
	
		Producess No_1 = new  Producess();
		
		 Consunmer No_2 = new  Consunmer();
		 
		  No_1.source = Obj;
		  No_2.Source = Obj;
		  
		  No_1.start();
		  No_2.start();
	}

}

class Sourcess {

	List<Integer> list = new ArrayList<>();

	int count = 0;
	public synchronized void Addingnumber() throws InterruptedException {
		Thread.sleep(1500);
		if (list.size() == 10) {
			System.out.println("Wating Number's....!");
			wait();
		}

		list.add(count);
		count++;
		System.out.println("Adding... : " + count);
		notify();
	}

	public synchronized void Removesnumber() throws InterruptedException {

		if (list.size() == 0) {
			System.out.println("Memeory Is Full....!");
			wait();
		}
		int i = list.remove(0);
		System.out.println("Remove Elements : " + i);
		notify();
		
		System.out.println("Modified List : "+list);
	}
}

class Producess extends Thread {
	Sourcess source;

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (true) {
			try {
			source.Addingnumber();
			}catch (Exception ex)
			{
				System.out.println("No Vaild....!");
			}
		}
	}
}

class Consunmer extends Thread {
	Sourcess Source;

	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				Source.Removesnumber();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}