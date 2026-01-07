package stream_api;

public class log_2 {
	public static void main (String [] args)
	{
		
		I_hlw t = () -> {
			System.out.println("hlw");
		};
		// System.out.println(t);
		t.hlw();
	}

}

interface I_hlw
{
	void hlw();
	
//	void bye();
}

// Out put :- stream_api.log_2$$Lambda/0x000002c783001c08@6e2c634b
