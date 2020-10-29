
public class Example3 {
public static void main(String[] args) {
	
	String s1="computer";
	String s2="";
	for(int i=s1.length()-1;i>=0;i--) {
		char ch=s1.charAt(i);
		s2=s2+ch;
		s2=s2+'-';
	}
	System.out.println(s2);
}
}
