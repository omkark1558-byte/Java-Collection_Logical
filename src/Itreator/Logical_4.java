package Itreator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Logical_4 {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(20);
		num.add(21);
		num.add(30);
		num.add(31);
		num.add(40);
		num.add(41);
		num.add(50);
		num.add(51);
		num.add(60);

		ListIterator<Integer> num1 = num.listIterator();

		while (num1.hasNext()) {
			if (num1.next() == 31) {

				num1.remove();
			}
			System.out.println(num1.next());
		}
	}

}
