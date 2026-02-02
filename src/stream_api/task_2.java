package stream_api;

import java.util.*;

public class task_2 {

	public static void main(String[] args) {

		List<Integer> li1 = Arrays.asList(10, 20, 30, 80, 70, 45, 65);
		List<Integer> li2 = Arrays.asList(5, 15, 25, 35, 45, 55, 65);
		List<Integer> li3 = Arrays.asList(100, 200, 300, 400, 500, 600, 700);
		List<Integer> li4 = Arrays.asList(9, 19, 29, 39, 49, 59, 69);
		List<Integer> li5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		List<List<Integer>> masterList = Arrays.asList(li1, li2, li3, li4, li5);

		System.out.println("Add List : "+masterList);
		int Sum =	masterList.stream()
		.flatMap((i)-> {return (i.stream());})
		.reduce(0,(i,j)->{return (i+j);});
	
		System.out.println("Sum : "+Sum);
		
		
	//	.forEach((i)->{System.out.println(i);});
		
		// WellComMMELJA 
	
	}

}
