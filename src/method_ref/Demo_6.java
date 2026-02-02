package method_ref;

import java.util.List;

public class Demo_6 {

	public static void main(String[] args) {
		 
		// Collector 

		Demoi demo = new Demoi();
		List.of(9,76,86,56,74,65,78,34)
		.stream()
		.filter(demo::check)
		.forEach((i)->{System.out.println(i);});
		
		
	}
	}

class Demoi
{
	public boolean check(int i)
	{
		return i < 16;
	}
}