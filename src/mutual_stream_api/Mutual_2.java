package mutual_stream_api;
import java.util.ArrayList;
import java.util.List;

// Adding the Only Elements.....

public class Mutual_2 {

	public static void main(String[] args) {

		Sourecess obj = new Sourecess();
		obj.Addnumber();

	}

}

class Sourecess {
	List<Integer> list = new ArrayList<>();

	public void Addnumber() {
		int num = 1;
		System.out.println("Waiting The Eelement's .....");
		while (list.size() <= 10) {
			System.out.println("Adding The Number.... : " + list.size());
			list.add(num);
			num++;
		}
		System.out.println("List is Full Stop the Adding....⚠️");
	}
}
