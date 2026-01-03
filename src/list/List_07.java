package list;

import java.util.*;

public class List_07 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		Collections.addAll(list,1, 2, 03, 04, 06, 05, 07, 8);
		// list.add(10);
		System.out.println(list);
//		
//		for(int i : list)
//		{
//			System.out.println(i);
//		}
//		

		Iterator<Integer> itr = list.iterator();

//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());

		while (itr.hasNext()) {
			 if(itr.next() == 4){
				 itr.remove();
			 }
		//	System.out.println(itr.next());
		}
		System.out.println(list);

	}
}

// System.out.println(itr);// Default Call The HEx location Print Out :- toSt