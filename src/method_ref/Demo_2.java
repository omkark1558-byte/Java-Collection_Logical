package method_ref;

public class Demo_2 
{ 
	public static void main(String [] args) 
	{
		 Runnable r = () -> System.out.println("Hellow");
		 r.run();
	}
}
