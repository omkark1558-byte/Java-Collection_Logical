package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Logical_1 {

	public static void main(String[] args) {
		
		List<List<Integer>> list = Arrays.asList(
                Arrays.asList(10,20,30),
                Arrays.asList(20,56,69),
                Arrays.asList(55,65,45));
		
		list.stream()
		.flatMap(i->i.stream())
		.map((i)->{return i*2;})
		 .collect(Collectors.groupingBy((i) -> {
			 return i>3;
		 }
		)
				 );

		 	}

}
