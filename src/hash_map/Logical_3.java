package hash_map;

import java.util.Map;
import java.util.HashMap;

public class Logical_3 {
	public static void main(String [] args)
	{
		String Name = "OKMAKTYYOOMKK";
		
		char[] chars = Name.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char l : chars)
		{
			int frequency=1;
			if(map.containsKey(l))
			{
				frequency = map.get(l)+1;
			}
			map.put(l, frequency);
		}
		System.out.println(map);			
	}

}
