package race_condition;

import java.util.Scanner;

public class Demo_1 {

	public void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);

		
		// Race Condition Problem...!
		
		
		Counter cou = new Counter();

		Runnable task = () -> {
			
			for (int i = 0; i < 1000; i++) {
				cou.incerment();
			}
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final outPut : "+cou.count);
		
		sc.close();
	}


}

class Counter {
	int count = 0;

	public void incerment() {
		count++;
	}
}
