package stream_api;

import java.util.function.Predicate;

public class Consumer_3 {

	public static void main(String[] args) {
		 
		// Using Consumer ...!
		
		
		Predicate<String> pred = (s)->{
			return s.length()>10;
		};
		
		System.out.println(pred.test("OMKAR"));
	}

}
