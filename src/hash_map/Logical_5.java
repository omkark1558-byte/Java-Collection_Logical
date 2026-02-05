package hash_map;

import java.util.HashMap;
import java.util.Map;

public class Logical_5 {

	public static void main(String[] args) {
		 
		String name = "ooptyytkisieooruyyyrutteg";
		
		char[] ch = name.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char o : ch)
		{
		
			int count =1;
			if(map.containsKey(o))
			{
				count = map.get(o)+1;
			}
			map.put(o, count);
		}

		System.out.println(map);
	}

}
