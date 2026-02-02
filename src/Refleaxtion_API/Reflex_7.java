package Refleaxtion_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflex_7 {

	public static void main(String[] args)throws Exception {
		 

		Class<?> obj = Class.forName("Refleaxtion_API.students");
		
		System.out.println("Class Name :"+obj.getName());
		
		System.out.println("\nConstructors:");
		for(Constructor<?> c : obj.getDeclaredConstructors())
		{
			System.err.println(c);
		}
		System.out.println("\nMethods:");
		for(Method m:obj.getDeclaredMethods())
		{
			System.out.println(m);
		}
		System.out.println("\nFields:");
		for(Field f:obj.getDeclaredFields()) {
			System.out.println(f);
		}
	}

}

class students
{
	int id;
	String name;
	public students(){
		
	}
	public students(int id)
	{
		
	}
	public void study() {
		
	}
}