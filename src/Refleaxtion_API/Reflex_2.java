package Refleaxtion_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflex_2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<?> cl = Class.forName("Refleaxtion_API.Employee");

		Constructor<?>[] cs = cl.getDeclaredConstructors();

		for (Constructor<?> t : cs) {
			System.out.println(t);
			System.out.println("************s");
			System.out.println(t.getName());
			System.out.println(t.getParameterCount());
			Class<?>[] gm = t.getParameterTypes();
			for( Class<?> y:gm)
			{
				System.out.println(y);
			}
			System.out.println("-------");
		}
		
		
		     Constructor<?> h=cl.getDeclaredConstructor();
		     System.out.println(h);
		     System.out.println("---------------");
		     
		     h.setAccessible(true);
		     
		     Employee h1=(Employee)h.newInstance();
		     System.out.println(h1.Demo);

	}
}

class Employee {
	
	String Demo ="MAHARASHTRA..!";
	private Employee() {

	}

	public Employee(int Id) {

	}

	public Employee(int IOD, int Number) {

	}
}
