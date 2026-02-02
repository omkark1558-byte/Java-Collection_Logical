package Itreator;

import java.util.List;


public class Demo_list {
	public static void main(String [] args) {
		

		List<Integer> l3=List.of(1,6,9,3,9,6,6,2,8,8);
		
	
		l3.stream()
//		.allMatch((i) -> {return i<10;})
//		.anyMatch((i) -> (i<2))
//		.noneMatch((i)-> (i==1))
		
		.distinct()
		.filter((i) -> {return i>5;})
		.map((i) -> {return i.toString();})
		
//		.peek((i) -> {System.out.println(i + "$$");})
		.limit(0)
		.skip(1)
		.forEach((i) -> {System.out.println(i);});
		
//		.count()
		
		
		List<Integer> l5=List.of(1,6,9,3,9,6,6,2,8,8);
		
		l5.stream()
		.distinct()
		.sorted()
//               --->>>>>> 
		.limit(2)
		.forEach((i) -> {System.out.println(i);});
		
		
	}

}

