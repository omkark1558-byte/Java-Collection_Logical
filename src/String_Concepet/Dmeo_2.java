package String_Concepet;

//import java.util.Demo_1;

public class Dmeo_2 {

	public static void main(String[] args) {
		 
		Demo_1 Y = new Demo_1();
		Y.setId(1);
		Y.setName("YASH");
		
		Demo_1 Y1 = new Demo_1();
		
		Y1.setId(2);
		Y1.setName("YASH");
		 
//		System.out.println("Shallow Compare : " + (Y == Y1));
//		System.out.println("Deep Compare : " + (Y.equals(Y)));
		
		System.out.println("Compare : " + (Y.equals(Y1)));
		
	}

}
