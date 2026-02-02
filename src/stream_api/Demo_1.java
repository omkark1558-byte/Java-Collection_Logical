package stream_api;

import java.util.function.Predicate;

public class Demo_1 {
	public static void main (String [] args)
	{
	
		Predicate<Integer> pre = (i)->{
			return i %2==0; 
		};
		System.out.println(pre.test(15));
	}

}
