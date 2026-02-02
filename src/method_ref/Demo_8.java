package method_ref;

import java.util.List;

public class Demo_8 {

	public static void main(String[] args) {
		 
		String Name = "Hello City's : ";
		List.of("Beed","Paithan","Kolhapur","Ahilyanagar")
		.stream()
		.map(String::toLowerCase)
		.map(Name::concat)
		.peek(System.out::println)
		.map(String::length)
		.forEach((i)-> {System.out.println(i);});
	
//		.map((i)->{return i.length();})
		
	}

}
