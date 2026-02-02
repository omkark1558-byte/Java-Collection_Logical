package Demi_Class;

import java.util.*;

public class Demo_6 {

	public static void main(String[] args) {

		Set<Demii> li = new TreeSet<>();
		
		Demii de = new Demii(2,"java");
		Demii d2 = new Demii(2,"java");
		Demii d3 = new Demii(4,"jjava");
		Demii d4 = new Demii(2,"jahva");
		Demii d5 = new Demii(4,"java");
		
		li.add(de); li.add(d5); li.add(d4); li.add(d3); li.add(d2);
		System.out.println(li);

	}
}

class Demii implements Comparable<Demii> {
	
	int id;
	String name;
	
	Demii(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Demii o) {
		return this.name.compareTo(o.name);
	}
	
	public String toString()
	{
		return this.id + " "+ this.name;
	}
}




 class Sort_name implements Comparator<Demii>{



	@Override
	public int compare(Demii o1, Demii o2) {
		
		return o1.name.compareTo(o2.name);
	}
	 
	 
	 
 }
