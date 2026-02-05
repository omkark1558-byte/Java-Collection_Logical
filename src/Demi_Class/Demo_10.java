package Demi_Class;

public class Demo_10 {

	public static void main(String[] args) {
		 
		// Reverse Number Form Integer
	
		int a = 123;
		int b = 0;
		while(a>0)
		{
			b = b * 10 + (a % 10);
			a = a / 10;		
		}
			System.out.println(b);
	}

}
