package method_ref;

import java.util.List;

public class Demo_1 {

	public static void main(String[] args) {
 
		
		List.of("OMAKR","YASH","VIRAJ","ANIKEAT","KRUSHNA")
		.stream()
		.map(String::toUpperCase)
		.peek(System.out::println)
		.map(String::length)
		.forEach(System.out::println);

	}

}
