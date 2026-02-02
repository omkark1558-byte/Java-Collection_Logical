package Vector_Class;

import java.util.Scanner;

public class Vector_2 {
	int Id;
	String Name;

	public Vector_2(int Id, String Name) {

		this.Id = Id;
		this.Name = Name;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your School No :");

		int i = sc.nextInt(); // Input :

		switch (i) {
		case 1:

			Vector_2 Ve = new Vector_2(1, "SWA Sawrkar Vidhyalya");
			System.out.println(Ve.Id + " " + Ve.Name);
			break;
		case 2:
			Vector_2 Ve1 = new Vector_2(2, "Sanaskar Vidhyalya");
			System.out.println(Ve1.Id + " " + Ve1.Name);
			break;
		case 3:
			Vector_2 Ve2 = new Vector_2(3, "SWA Champawati Vidhyalya");
			System.out.println(Ve2.Id + " " + Ve2.Name);
			break;
		case 4:
			Vector_2 Ve3 = new Vector_2(4, "Ji. Jijamata Vidhyalya");
			System.out.println(Ve3.Id + " " + Ve3.Name);
			break;
		case 5:
			Vector_2 Ve4 = new Vector_2(5, "TR Sen-Tense Vidhyalya");
			System.out.println(Ve4.Id + " " + Ve4.Name);
			break;
		default:
			System.out.println("Invalid School Number's");

		}
		sc.close();
	}
}
