package Demi_Class;

import java.util.HashMap;
import java.util.Map;

public class Demo_11 {

	public static void main(String[] args) {
		String name = "rrrutuosooposioijjnhg";

		char[] ch = name.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		int count = 1;

		for (char k : ch) {
			if (map.containsKey(k)) {

				count = map.get(k) + 1;
			}
			map.put(k, count);
		}
		System.out.println(map);
	}
}
