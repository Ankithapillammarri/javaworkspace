
public class Example2 {
	public static String test(String s) {

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int s1 = i;
			while (i < ch.length) {
				i++;
			}
			char temp = ch[s1];
			ch[s1] = ch[i - 1];
			ch[i - 1] = temp;
		}
		return new String(ch);

	}

	public static void main(String[] args) {
		String s1 = "Hello world";
		System.out.println(test(s1));

	}
}
