
public class Tablet {
	void createsound(Animal a) {
		a.sound();
	}
	public static void main(String[] args) {
		Tablet t=new Tablet();
		Cow c=new Cow();
		t.createsound(c);

		Cat d=new Cat();
		t.createsound(d);

		Dog e=new Dog();
		t.createsound(e);
	}
}
