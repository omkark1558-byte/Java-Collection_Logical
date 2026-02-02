package Refleaxtion_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflex_1 {

	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, NoSuchFieldException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<?> Y = Class.forName("Refleaxtion_API.Visual");

		Field[] U = Y.getDeclaredFields();

		Constructor<?> u = Y.getDeclaredConstructor(String.class, double.class, int.class);
//		 Constructor<?> u1 = Y.getDeclaredConstructor(double.class);

		u.setAccessible(true);

		Visual c = (Visual) u.newInstance("PIKU", 5020.0, 20);

		System.out.println(c);
		Visual i = (Visual) u.newInstance("GAURI & OMAKR", 500.00, 205);
		System.out.println(i.getClass());

		for (Field p : U) {
			System.out.println(p.getType());

		}

		Field nam = Y.getDeclaredField("Name");
		System.out.println("____________________");
		System.out.println(nam);

		nam.setAccessible(true);
		System.out.println(nam.get(i));

		Field nam2 = Y.getDeclaredField("salary");
		nam2.setAccessible(true);
		System.out.println(nam2.getDouble(i));
	}

}

class Visual {
	private String Name;
	private double salary;
	private int No;

	private Visual(String Name) {
		System.out.println("OBJECT CREATED...!");
		this.Name = Name;
	}

	private Visual(double salary, int pay) {
		System.out.println("SEC OBJECT CREATED...^");
		this.salary = salary;
	}

	private Visual(String name, double price, int No) {
		this.Name = name;
		this.salary = salary;
		this.No = No;
		System.out.println("------------");
	}
}
