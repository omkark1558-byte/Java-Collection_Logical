package stream_api;

import java.util.Arrays;
import java.util.List;

public class list_of_list_logical_1 {

	public static void main(String[] args) {

		List<List<Integer>> list = Arrays.asList(Arrays.asList(20, 10), Arrays.asList(25, 45), Arrays.asList(25, 45));

		int sum = list.stream().flatMap(List::stream).mapToInt(Integer::intValue).sum();
		System.out.println("sum = " + sum);

	}

}
