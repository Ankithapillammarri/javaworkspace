
public class Student {
	void createeat(Chips c) {
		c.eat();
	}
	public static void main(String[] args) {
		Student s=new Student();
		
		Bingo b=new Bingo();
		s.createeat(b);
		
		Lays l=new Lays();
		s.createeat(l);
		
		Kurkure k=new Kurkure();
		s.createeat(k);
	}
}
