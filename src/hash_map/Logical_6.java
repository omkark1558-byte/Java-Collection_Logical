package hash_map;

import java.util.HashMap;
import java.util.Map;

public class Logical_6 {

	public static void main(String[] args) {
		 
		String name = "uutieuowwjfhdjeihhhytttrew";
		
		char[] ch = name.toCharArray();
		
	     Map<Character, Integer> hp = new HashMap<>();
	     
	     for(char o : ch)
	     {
	    	 	int count = 1;
	    	 	if(hp.containsKey(ch))
	    	 	{
	    	 		count = hp.get(o)+1;
	    	 	}
	    	 	hp.put(o, count);
	     }
System.out.println(hp);
	}

}
