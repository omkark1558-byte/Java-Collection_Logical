package Itreator;

//import java.util.HashMap;
//import java.util.Iterator;
import java.util.List;
//import java.util.Map;
import java.util.function.Consumer;
//import java.util.*;

public class Logical_5 {

	public static void main(String[] args) {

//		Map<Integer, String> map = new HashMap<>();
//
//		map.put(1, "Apple");
//		map.put(2, "Mango");
//		map.put(3, "Banana");
//		map.put(4, "Grapes");
//		map.put(null, null);
//		map.put(6, null);
//		
//		 System.out.println(map);
//		map.forEach((key, value) -> {
//			System.out.println(key + " : " + value);
//		});
//		
//		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			if(it.next() == ) {
//				it.remove();
//			}
//		}
	
//	
//		List<Integer> li = List.of(34,4654,745,34,4);
//		
//		List<Integer> li2 = List.of(324,45,756,2);
//		List<Integer> li3 = List.of(324,45,756,2);
//		
//		
//	
//		List<List<Integer>> seli = List.of(li,li2,li3);
//		List<List<List<Integer>>> seli2 =List.of(seli);
//		
//		System.out.println(seli);
		
//		List<Integer> ty = new ArrayList<>();
//		for(int i =1; i<=seli.size();i++) {
//			System.out.println(i);
//			 
//			System.out.println();
//		}
//	
//		Two_c se = new Two_c();
//		se.accept(seli);
//		
//		Fourth f = new Fourth();
//		f.accept(seli2);
//		
		
//		
//		System.out.println(seli);
//		
//		seli.stream().flatMap(l->l.stream())
//		.forEach((i)->{System.out.println(i);});
//		
//		System.out.println(map);
		
		
	}

}

class two2 implements Consumer<List<Integer>>{

	

	@Override
	public void accept(List<Integer> t) {
		
		int sum = 0;
		for(int j : t) {
		       System.out.println(j);
		}
		System.out.println(sum);
	}
		
}


class Two_c implements Consumer<List<List<Integer>>>{

	@Override
	public void accept(List<List<Integer>> t) {
		
		for(List<Integer> li : t) {
			two2 d = new two2();
			d.accept(li);
		}
		
	}
	
}
class Fourth implements Consumer<List<List<List<Integer>>>>{

	@Override
	public void accept(List<List<List<Integer>>> t) {
		
		for(List<List<Integer>>list2 : t) {
			
			Two_c y = new Two_c();
			y.accept(list2);
		}
	}
	
}

