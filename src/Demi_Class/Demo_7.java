package Demi_Class;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo_7 {

	public static void main(String[] args) {
	 
		
		Queue<Integer> lis = new PriorityQueue<>(new Cus());
		
		lis.offer(43);
		lis.offer(43);
		lis.offer(32);
		lis.offer(87);
		lis.offer(73);
		System.out.println(lis);
		System.out.println(lis.peek());
		System.out.println(lis.poll());
		System.out.println(lis);
		

	}

}

class Cus implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return Integer.compare(o2.intValue(), o1.intValue());
	}
	
	
}

