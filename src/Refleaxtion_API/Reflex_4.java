package Refleaxtion_API;

import java.lang.reflect.Constructor;

public class Reflex_4 {

	public static void main(String[] args) throws Exception{

		Class<?> It = Class.forName("Refleaxtion_API.Unik_IT_Park");

		Constructor<?>[] GT = It.getDeclaredConstructors();

//		System.out.println(GT.length);
//		for (Constructor<?> F : GT) {
//			System.out.println("-------*-*-*-*-------");
//			System.out.println(F);
////			 System.out.println(F.isAccessible());
//		}

		Constructor<?> c = It.getDeclaredConstructor(char[].class);
		
		Unik_IT_Park obj =(Unik_IT_Park)c.newInstance(new char[] {'O','G'});
		
		System.out.println(obj);
	}
}

class Unik_IT_Park {
	
	private char[] name;
	 Unik_IT_Park() {
		System.out.println("Default Cons..!");
	}

	  Unik_IT_Park(int Id, double Salary) {

		System.out.println("Parameter's Cons");
	}

	  Unik_IT_Park(float pay) {
		System.out.println("Single Parameter Con's....!");
	}
	 public Unik_IT_Park(char[] nam)
	  {
		 this.name=nam;
		  System.out.println("------");
	  }
	 public String toString() {
		 return "Name : "+ new String(name);
	 }

}
