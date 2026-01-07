package Itreator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Logical_3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		Collections.addAll(list, 10, 20, 30, 4, 5, 1, 7);

		Iterator<Integer> itr = list.iterator();

		System.out.println(list.size());

		while (itr.hasNext()) {
			Integer value = itr.next();
			System.out.println(value);
		}
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			
//		}

	}
}
