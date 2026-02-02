package stream_api;

 
import java.util.List;

public class Consumer_4 {

	public static void main(String[] args) {
	 
		List.of("OMKAR","Gauri","Dhyanu","YASH")
		.stream()
		.peek((i)->System.out.println(i))
		.map((i)->{return i.length();})
		.forEach(System.out::println);
		
	 

	}

}
