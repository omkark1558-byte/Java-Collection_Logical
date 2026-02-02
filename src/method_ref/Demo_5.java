package method_ref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo_5 {
	public static void main(String [] args)
	{
		// Handle Null Point Exception
	
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 10,50,45,78,75,89,null);
		 
		list.stream()
		.filter(handel::check)
		.forEach(System.out::println);
		
		
	}
}

class handel {
	public static boolean check(Integer i)
	{
		try {
			if(i > 15 && i < 25){
				
			return true;
			}
		}
		catch (NullPointerException e){
			System.out.println("Handel Class : Null Point Exceaption..!");
		}
		return false;
	}
}
