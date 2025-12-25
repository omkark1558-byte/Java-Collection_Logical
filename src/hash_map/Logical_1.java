package hash_map;
 import java.util.*;

public class Logical_1 {

	public static void main(String[] args) {
		 
		
		String name = "OOMKAAKRRTTKARO";
		
		char[] ch = name.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char  h : ch)
		{
			 int frequency = 1;
			 if(map.containsKey(h))
			 {
				 frequency=map.get(h)+1;
			 }
			 map.put(h, frequency);
		}
		System.out.println(map);
	}
}
