package Vector_Class;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {

		List<Object> vec = new Vector<>();

		Collections.addAll(vec, null, 1, 20, 45, 78, 38, 95, null, 'K', "OMAKR", "GAURI");

		 vec.addFirst(10);
		 vec.addLast(56);
		System.out.println(vec);
		System.out.println(vec.size());
		
	}

}
