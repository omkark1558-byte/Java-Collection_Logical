package Itreator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class Logical_2 {

	public static void main(String[] args) {

		// Using the While Loop ()

		LinkedList<String> list = new LinkedList<>();

		Collections.addAll(list, "OM", "NA", "AJ", "VI", "GEN");

		Iterator<String> itr = list.iterator();

		// Using the while loop Print One Bye One Array Inside The Elements
		
		for (String name : list) {
			System.out.println(name);
		}

		while (itr.hasNext()) {
			String value = itr.next();
		//	System.out.println(value);

			if (value.equals("GEN"))
				itr.remove();
		}
		System.err.println(list);
		
		System.out.println("----------");
	}

}