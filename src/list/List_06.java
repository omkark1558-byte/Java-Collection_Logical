package list;

import java.util.*;

public class List_06 {

	public static void main(String[] args) {

		Queue<Integer> q = new ArrayDeque<>();

		Collections.addAll(q, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 5, 4, 6, 7);
//		queue.add(10); queue.add(30); queue.add(50); queue.add(90); queue.add(60);`
//		queue.add(60); queue.add(40); queue.add(70); queue.add(80); queue.add(20);
		
		q.add(10);
		q.offer(20);

		System.out.println(q.poll());

		System.out.println(q.peek());

		System.out.println(q);

	}

}
