package list;

import java.util.*;

public class List_01 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 10);

		List<Integer> list2 = new ArrayList<>();
		Collections.addAll(list2, 1, 2, 3, 4, 5, 6, 7, 8, 10);

		System.out.println(list);

		System.out.println(list.contains(1));
		 
		/*
		 * Contains Check the Value in Collection Of array And show the in True or false
		 * Answer
		 */

		System.out.println(list.equals(list2));
		
		/* Equals Check the Two Array in the 
		 * * Same Value
		 * * Same order
		 * * Same Elements
		 * Show the asnwer is True Or false
		 */
		
		System.out.println(list.isEmpty());
		
		// is Empty Work Array in Zero Elements !

	}
}
