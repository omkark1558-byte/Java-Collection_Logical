package Demi_Class;

import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;
// import java.util.Stack;
//import java.util.Vector;
// import java.util.stream.IntStream;

public class Demo_3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(2);
		list.add(9);
		list.add(5);
		
		
	list.sort((i,j) -> {return Integer.compare(j, i);});

		System.out.println(list);

		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(5);
		list1.add(8);
		list1.add(6);
		list1.add(6);
		list1.add(4);
		list1.add(3);
		list1.add(1);
		list1.add(null);
		System.out.println(list1);

		LinkedList<String> list2 = new LinkedList<>();

		list2.add("Imnae");
		list2.add("Imnae");
		list2.add(1,"Imnae");
		list2.add(2,"Ioaa");

		System.out.println(list2);
		
//		List<Integer> i = new Vector<>();

	 
	}

}