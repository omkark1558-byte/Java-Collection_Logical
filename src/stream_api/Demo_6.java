package stream_api;

import java.util.function.Function;

public class Demo_6 {

	public static void main(String[] args) {
	 
		Function<String , Integer> fun = (i) ->{return i.length();};
		
		Function<Integer , Double> fun1 = (i) ->{ return i*5.0 ;};
		
		System.out.println(fun.apply("OMII"));
		System.out.println(fun1.apply(20));
	}
}