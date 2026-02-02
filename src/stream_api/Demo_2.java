package stream_api;

import java.util.function.Predicate;

public class Demo_2 {
	public static void main (String [] args)
	{ 
		
		Students s1 = new Students(10,"Omakr");
		Students s2 = new Students(46, "ANikt");
	
		Predicate<Students> ispassed = (s) ->{
			return s.marks >= 35;
		};
		System.out.println(ispassed.test(s1));
		System.out.println(ispassed.test(s2));
	 
	}

}

class Students {
	int marks;
	String name;

	Students(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}
}
