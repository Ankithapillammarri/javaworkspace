
public class Example1 {
	public static String test(String s) {
		int length = s.length();
		String lowerCase = "";
		String upperCase = "";
		for (int i = 0; i < length; i++) {

			char ch = s.charAt(i);
			if (ch == 'x') {
				upperCase += ch;
			} else {
				lowerCase += ch;
			}
		}
		return lowerCase + upperCase;
	}

	public static void main(String[] args) {

		String str = "abcxXXxsdexx";

		System.out.println(test(str));
	}
}
