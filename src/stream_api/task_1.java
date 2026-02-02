package stream_api;

import java.util.Arrays;
import java.util.List;

public class task_1 {

	public static void main(String[] args) {

		List<String> sb1 = Arrays.asList("ITEN", "UTIOE", "IOTP", "AZZIM");
		List<String> sb2 = Arrays.asList("Tiio", "yaiie", "Kaiaijeh", "KIoa");
		List<String> sb3 = Arrays.asList("Wikeings", "Anana", "nanan", "paiue");

		List<List<String>> sb4 = List.of(sb1, sb2, sb3);

		int sum = sb4.stream()
				.flatMap((i) -> { return i.stream();})
				.peek((i) -> System.out.println("List : " + i))
				.map((i) -> {return i.length();})
				.reduce(0, (i, j) -> { return i + j;});

		System.out.println(sum);

	}
}
