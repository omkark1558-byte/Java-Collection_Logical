package Refleaxtion_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflex_5 {

	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, NoSuchFieldException,
			IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {

		Class<?> n = Class.forName("Refleaxtion_API.Vs");

		Field[] i = n.getDeclaredFields();

		Constructor<?> Con = n.getDeclaredConstructor(String.class);
		Con.setAccessible(true);
		Vs obj =(Vs)Con.newInstance("Omkar");
		
		Field obj1 =n.getDeclaredField("Name");
		obj1.setAccessible(true);
		System.out.println(obj1.get(obj));
		
		obj1.set(obj, "Updated Field..!");
		System.out.println(obj1.get(obj));
		
	}

}

class Vs {
	private String Name;
	private double salary;

	private Vs(String Name) {
		System.out.println("Object ...⚠️");
		this.Name = Name;
	}
	
	public Vs(double salary)
	{
		this.salary = salary;
	}

}
