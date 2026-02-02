package Demi_Class;

//import java.util.List; 

public class Demo_1 {

	public static void main(String[] args) {
		 
		  
		Demi i = new Demi(1,"ii");
		
		System.out.println(i);
		 
		
	}

}

class Demi 
{
	int id;
	String Name;

 

	public Demi()
	{
		System.out.println("default con");
	}
	
	public Demi(int id, String Name)
	{
		this.id = id;
		this.Name = Name;
		System.out.println("paramet");
	}
	
}