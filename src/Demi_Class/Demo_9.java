package Demi_Class;

public class Demo_9 {

	public static void main(String[] args) {

		int a = 9474;
		int f = 0;
		for (int i = 0; i < 5; i++) {

			int di = a % 10;
			int sum = di * di * di * di;
			f = f + sum;
			a = a / 10;
		}

		System.out.println(f);

	}

}
