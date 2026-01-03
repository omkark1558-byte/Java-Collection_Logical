package list;

public class Logical_06 {
	public static void main(String[] args) {
		int n = 5;
		int b = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= b; j++) {
				if (i == j || j == i || i == n || j == b) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
