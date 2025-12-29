package list;

import java.util.List;
import java.util.ArrayList;

public class List_05 {

	public static void main(String[] args) {
		 

		List<Integer> list = new ArrayList<Integer>();
		 list.add(20); list.add(04); list.add(05);
		 list.add(06); list.add(78);
		 list.add(58); list.add(60);
		 list.add(null);
		 
		System.out.println(list.remove(null));
		
		System.out.println(list.isEmpty());
		
		System.out.println(list);
	}

}
