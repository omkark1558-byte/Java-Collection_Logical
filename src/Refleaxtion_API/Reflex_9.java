package Refleaxtion_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflex_9 {

	public static void main(String[] args) throws Exception{
		 

		Class<?> cal=Emp_info.class;
		
		Constructor<?> c = cal.getDeclaredConstructor(String.class);
		c.setAccessible(true);
		Field[] feilds = cal.getDeclaredFields();
		for(Field k : feilds)
		{
			System.out.println(k.getType());
		}
		Emp_info obj = (Emp_info) c.newInstance("name");
		
		Field obj_1 = cal.getDeclaredField("name");
		obj_1.setAccessible(true);
		obj_1.set(obj, "Omkar Kale");
		System.out.println(obj_1.get(obj));
		
		Method m =cal.getDeclaredMethod("getname");
		m.setAccessible(true);
		System.out.println(m.invoke(obj));
	}

}

class Emp_info
{
	private String name;
	private int Id;
	private double salary;
	
	private Emp_info(String name){
		this.name = name;
	}
	
	private int getname() {
		
		return this.Id;
	}
}
