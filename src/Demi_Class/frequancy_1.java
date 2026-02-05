package Demi_Class;

import java.util.HashMap;
import java.util.Map;

public class frequancy_1 {

	public static void main(String[] args) {

		String name = "IJIEERTYYRTTOOPUWHS";

		char[] chas = name.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		int count = 1;
		for (char i : chas) {
			if (map.containsKey(i)) {
				count = map.get(i) + 1;
			}
			map.put(i, count);
		}
		System.out.println(map.get('I'));
	}

}
