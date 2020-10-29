
public class B extends A {
	int count=60;
	void m() {
		int count=30;
		System.out.println(count);
		System.out.println("this.count: "+this.count);
		System.out.println("super.count: "+super.count);
	}
}
