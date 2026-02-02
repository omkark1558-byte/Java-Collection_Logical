package stream_api;

import java.util.function.Predicate;

public class Consumer_2 {

	public static void main(String[] args) {
 
		// Using Functional Interface :- Predicate 

		Master_Students stu = new Master_Students();
		 
		System.out.println(stu.test(50));
	}

}

class Master_Students implements Predicate<Integer>
{

	@Override
	public boolean test(Integer t) {
		 return t>10;
	}
	
}