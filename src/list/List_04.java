package list;

import java.util.*;

public class List_04 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 111, 2341, 1011, 7761, 9999, null, 6679, 1143, 143, 691, 69);

		for (Integer h : list) {
			System.out.println(h);
		}

	}
}