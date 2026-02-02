package method_ref;

import java.util.List;

public class Demo_3 {

	public static void main(String[] args) {
		 
		// Method Reference
		
		
		List.of("HP-Laptop","Dell-Laptop","Lenvo-Laptop","Asus-Laptop")
		.stream()
		.map(i-> i.length())
		.forEach(System.out::println);
		
		System.out.println("-------------------");
		 
		List.of(10,45,67,89,90,48,110)
		.stream()
		.map((i)->{return (i >10);})
		.forEach(System.out::println);
 
	}

}
