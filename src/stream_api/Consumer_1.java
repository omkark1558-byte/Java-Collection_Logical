package stream_api;

import java.util.Optional;

public class Consumer_1 {

	public static void main(String[] args)
	{

		Optional<String> ops = Optional.empty();

//		System.out.println(ops.isEmpty());
//		System.out.println(ops.isPresent());
//
//		System.out.println(ops.get());
//		System.out.println(ops.orElse(null));
		 ops.orElseThrow(()-> new NullPointerException("Data Missing"));
		 System.out.println(ops);
	}
}

//class Demo implements Predicate<T>
//{
//	
//}