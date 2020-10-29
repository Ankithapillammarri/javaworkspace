
public class Pattern5 {
	public static void main(String[] args) {
		int star=1;
		for(int k=1;k<=7;k++) {
			for(int i=1;i<=star;i++) {
				System.out.print("*");
			}
			if(k<=3) {
				star++;
			}else {
				star--;
			}
			System.out.println();
		}
	}
}
