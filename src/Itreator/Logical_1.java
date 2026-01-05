package Itreator;

import java.util.LinkedList;
import java.util.Iterator;

public class Logical_1 {
	public static void main(String [] args)
	{
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Tiger");
		list.add("Elephant");
		list.add("Wolf");
		list.add("Hourse");
		list.add("Dog");
		
//		for(String animal : list)
//		{
//			System.out.println(animal);
//		}
		
		// It is A Old Method In Iterator ()
		
		Iterator<String> itr = list.iterator();
		 
		String value = itr.next();
		System.out.println("1 : "+value);
		
		value = itr.next();
		System.out.println("2 : "+value);

		value = itr.next();
		System.out.println("3 : "+value);
		
		value = itr.next();
		System.out.println("4 : "+value);

		boolean val = itr.hasNext(); // its Throw The 
		System.out.println(val);
		
		value = itr.next();
		System.out.println("5 : "+value);
		
//		value = itr.next();
//		System.out.println("6 : "+value); Add the method is throw the java.util.NoSuchElementException Exception

		boolean val1 = itr.hasNext();
		System.out.println(val1);

	}

}
