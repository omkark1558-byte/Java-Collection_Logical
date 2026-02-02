package Demi_Class;

import java.util.Stack;
import java.util.Vector;

public class Demo_4 {

	public static void main(String[] args) {

		Vector<Integer> i1 = new Stack<>();
		
		i1.add(10);
		i1.add(23);
		i1.add(52);
		i1.add(65);
		i1.add(78);
		i1.add(88);
		i1.add(70);

		Stack<String> li = new Stack<>();

		li.push("A");
		li.push("B");
		li.push("C");
		li.push("P");
		li.push("U");
//		li.push(null);
//		li.push(null);
	
//		System.out.println(li.peek());
//
//		System.out.println(li.getFirst());

		System.out.println(li.pop());
		
	}

}
