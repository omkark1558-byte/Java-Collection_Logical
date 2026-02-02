package method_ref;

import java.util.List;

//import java.util.function.Supplier;s

public class Demo_9 {

	public static void main(String[] args) {
	 
		// Consructer Ref
//		Supplier<String> list =String::new; 
//		System.out.println(list.get().concat("Hlw"));

//		I_Dehere<String> ghe = String::new;
//		
//		System.out.println(ghe.T_dere("Peyamedi"));
		
		List.of("Hello","Ghello","Mello")
		.stream()
//		.map(String::toUpperCase)
		.map(StringBuffer::new)
		.peek(System.out::println)
		.map(StringBuffer::reverse)
		.forEach(System.out::println);
		
	}
}
interface I_Dehere<T>
{
	T T_dere(T t);
}