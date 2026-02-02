package stream_api;

import java.util.Arrays;
import java.util.List;

public class task_3 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(10, 15, 20, 25);

		List<Integer> list2 = Arrays.asList(30, 35, 40, 45);

		List<Integer> list3 = Arrays.asList(50, 55, 60, 65);

		List<List<List<Integer>>> MasterList = Arrays.asList(Arrays.asList(list1), Arrays.asList(list2),
				Arrays.asList(list3));

		System.out.println(MasterList);

//	     int sum =	MasterList.stream()
//		.flatMap((i)->{return (i.stream());})
//		.flatMap((i)->{return (i.stream());})
//		.map((i) -> {i.size();})
//		.reduce(0,(i,j)->{return i+j;});

		int sum = MasterList.stream().flatMap(i -> i.stream()).map(i -> i.size()).reduce(0, (i, j) -> i + j);

		System.out.println(sum);
	}

}
