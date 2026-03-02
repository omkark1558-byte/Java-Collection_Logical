package collectors_logical;

import java.util.*;
import java.util.stream.Collectors;

public class Demo_2 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ram", "Shyam", "Omii","Gauri","Omkar","ANNA","NANA");

		List<String> result = names.stream().collect(Collectors.toList());

		System.out.println(result);
	}
}
