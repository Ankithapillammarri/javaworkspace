
public class Factorial1 {

	static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {

		int i = fact(2);
		System.out.println("Factorial is " + i);
	}
}
