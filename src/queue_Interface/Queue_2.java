package queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_2 {

	public static void main(String[] args) {
		 
		
		Queue<Integer> Qu = new LinkedList<Integer>();
		Qu.offer(10);
		Qu.offer(18);
		Qu.offer(18);
		Qu.offer(16);
		Qu.offer(18);
		Qu.offer(15);

		System.out.println(Qu.poll());
		System.out.println(Qu.offer(470));
		System.out.println(Qu.add(50));
		System.out.println(Qu.remove(15));
		System.out.println("Modified List : "+Qu);

	}

}
