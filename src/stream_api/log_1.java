package stream_api;

public class log_1 {
	public static void main(String[] args) {

		I_demo<Integer, String, Character> rdemo = (t1, y1, u1) -> {
			return new StringBuffer("Hello").append(10).append('a').toString();
		};
		String add = rdemo.demo(10, "Hello", 'a');
		System.out.println(add);

	}
}

interface I_demo<T, A, R> {

	A demo(T t1, A y1, R u1);
}
