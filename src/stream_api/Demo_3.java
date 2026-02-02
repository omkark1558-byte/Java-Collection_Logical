package stream_api;

import java.util.function.Predicate;

public class Demo_3 {
	public static void main(String[] args) {

		Employee sal = new Employee(2000.0, "Asencuter");
		Employee sal1 = new Employee(3000.0, "JP Morgan");
		
		Predicate<Employee> salared = (i) -> {
			return i.salary <= 1000;
		};
		System.out.println(salared.test(sal));
		System.out.println(salared.test(sal1));
	}

}

class Employee {
	double salary;
	String name;

	Employee(double salary, String name) {
		this.name = name;
		this.salary = salary;
	}
}
