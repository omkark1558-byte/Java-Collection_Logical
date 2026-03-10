package String_Concepet;

public class Reverse_String {

	public static void main(String[] args) {

		String str = "PING PONG";
		String str_2 = "HONG KONG";
		String Reverse_string = "";
		String Reverse_string_2 = "";

		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			Reverse_string = ch + Reverse_string;
		}
		System.out.println("Printing The Reverse String: " + Reverse_string);

		System.out.println("\n");

		for (int j = 0; j < str_2.length(); j++) {
			ch = str_2.charAt(j);
			Reverse_string_2 = ch + Reverse_string_2;
		}
		System.out.println("Print Sec Reverse: " + Reverse_string_2);
	}

}
