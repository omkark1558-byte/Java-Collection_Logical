package hash_map;

import java.util.*;

public class Logical_2 {
	public static void main(String[] args) {
		String name = "kkiitueooepw";

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : name.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
	}

}
