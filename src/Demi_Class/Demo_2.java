package Demi_Class;

//import java.util.*;

public class Demo_2 {
	public static void main (String [] args)
	{  
		
	//	List<Integer> i = new ArrayList<>();
		
		
		Aze o = new On();
		System.out.println(o.demo());
		
	}
}
interface Aze
{
   public int demo();	
}

class On implements Aze{

	@Override
	public int demo() {
		
		return 200;
	}
	
	
	
}

