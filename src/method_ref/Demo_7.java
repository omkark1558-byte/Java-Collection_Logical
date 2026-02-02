package method_ref;

import java.util.List;

public class Demo_7 {

	public static void main(String[] args) {
		 
		
		List.of("Beed","Latur","Pune","Sambhajinagar","Jodpur")
		.stream()
		.map(String::toUpperCase) // Method Reference 
		.map(String::length) 
//	    !-> Arbitrary Type Reference  
//		.map((i)->{return i.length();}) old Method 
//		.map((i)->{return i.toUpperCase();})
		.forEach(System.out::println);

	}

}
