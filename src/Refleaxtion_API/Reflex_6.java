package Refleaxtion_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflex_6 {

	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, NoSuchFieldException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<?> cla = Class.forName("Refleaxtion_API.Mac");

		Constructor<?>[] obj_0 = cla.getDeclaredConstructors();
		Field[] i = cla.getDeclaredFields();

		Constructor<?> obj = cla.getDeclaredConstructor(String.class,int.class);
		obj.setAccessible(true);
		Mac cons = (Mac) obj.newInstance("Omakr", 20);

		for (Constructor<?> y : obj_0) {
			System.out.println(y.getName());
			System.out.println("---------------------");
			System.out.println(y.getParameterCount());
			System.out.println(y.getTypeParameters());
		}

		Field name = cla.getDeclaredField("Na");
		name.setAccessible(true);
		System.out.println(name.get(cons));

		Field name1 = cla.getDeclaredField("ID");
		name1.setAccessible(true);
		System.out.println(name1.get(cons));
	}

}

class Mac {
	String Na;
	int ID;

	Mac() {
		System.out.println("Objected.....⚠️");
	}

	Mac(String Na, int ID) {
		System.out.println("Nexted Created...!");
		this.Na = Na;
		this.ID = ID;
	}
}
