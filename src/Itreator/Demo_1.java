package Itreator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Apple");
		map.put(2, "Mango");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.put(null, null);
		map.put(6, null);
		
//		 System.out.println(map);
//		map.forEach((key, value) -> {
//			System.out.println(key + " : " + value);
//		});
		
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
		    System.out.println(it.next());
			if(it.next().getKey() == 1) {
				it.remove();
			}
		}

System.out.println(map);
	}

}
