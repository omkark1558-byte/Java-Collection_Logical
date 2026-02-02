package method_ref;

import java.util.List;

public class Demo_4 {

	public static void main(String[] args) {

		// Crate Special Kind Method Refernce\
		
		List.of(7, 4, 67, 56, 8, 9, 10, 75)
		.stream()
		.map(Demo::check)
		.forEach((i) -> {
		System.out.println("Refernce : " + i);
		});

	}

}

class Demo {
	public static boolean check(int i) {
		return i > 15;
	}
}
