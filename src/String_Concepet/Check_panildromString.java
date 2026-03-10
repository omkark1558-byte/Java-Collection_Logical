package String_Concepet;

public class Check_panildromString {

	public static void main(String[] args) {

		String name = "PEOP";
		String Name_2 = "";

		for (int i = 0; i < name.length(); i++) {
			Name_2 = name.charAt(i) + Name_2;
		}
		if (Name_2.equals(name)) {
			System.out.println(name + " : is Panildrom");
		} else {
			System.out.println(name + " :is Not Panildrom");
		}

	}

}
