package functional_interface;

import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

public class Demo_1 {

	public static void main(String[] args) {

		// Prdicate useing the Program..!
		
		
		List<User> user = new ArrayList<User>();

		user.add(new User("OMKAR", "Admin"));
		user.add(new User("Peter", "Memeber Of Parla"));

		List<?> admins = process(user, (User u) -> u.getRole().equals("Admin"));
		System.out.println(admins);
		System.out.println(user);
	}

	public static List<User> process(List<User> users, Predicate<User> predicate) {
		List<User> result = new ArrayList<User>();
		for (User user : users)
			if (predicate.test(user))
				result.add(user);
		return result;
	}

}

class User {
	String name, role;

	User(String a, String b) {
		name = a;
		role = b;
	}

	String getRole() {
		return role;
	}

	String getName() {
		return name;
	}

	public String toString() {
		return "User Name :" + name + ", Role : " + role;
	}
}