package Refleaxtion_API;

import java.lang.reflect.Constructor;

public class Reflex_3 {

	public static void main(String[] args) throws Exception {

		/**
		 * Spring Boot Concepts S :- 29-01-2026; Studentss i = new Studentss();
		 * System.err.println(i.getClass());
		 */

		Class<?> sl = Class.forName("Refleaxtion_API.Studentss");
		Constructor<?>[] ti = sl.getDeclaredConstructors();

		for (Constructor<?> y : ti) {
			System.out.println(y);
			System.out.println("-------------------");
			System.out.println(y.getName());

		}

		Constructor<?> HDB = sl.getDeclaredConstructor();
		System.out.println(HDB);
		
		HDB.setAccessible(true);
		Studentss TW =(Studentss)HDB.newInstance();
		System.out.println(TW);
	}
}

class Studentss {

	// private String name;
//	public int number;
//	public int price;

	private Studentss() {
		System.out.println("Deafult Constructer..$");
	}

	public Studentss(int i) {
		System.out.println("Paramter's Constructer");
	}

	public Studentss(int i, double price) {

		System.out.println("Two Parameter's Passing Consrtucter....%");
	}
}