package String_Concepet;

public class Reveres_String02 {

	public static void main(String[] args) {

		String Name = "LANISTER";
		String Name_2 = "JOHAN BARITYAN";

		System.out.println("Print Reverse: " + reverse(Name));
		System.out.println("Print Reverse: " + reverse(Name_2));
	}

	public static String reverse(String s) {
		String rev = "";
		char ch;

		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			rev = ch + rev;
		}
		return rev;
	}

}
