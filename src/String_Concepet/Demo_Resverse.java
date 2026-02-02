package String_Concepet;

public class Demo_Resverse {
	public static void main(String[] args) {

		String name = "iruaG";
		String sb = "rakmO";

		StringBuffer o = new StringBuffer(sb);
		StringBuffer i = new StringBuffer(name);

		System.out.println("Reverse Name : " + o.reverse());
		System.out.println("Reverse Sb : " + i.reverse());

		System.out.println(o.toString().equals(i.toString()));
		System.out.println("Length Of String : " + o.length());
		System.out.println("Length Of String : " + i.length());
	}
}
