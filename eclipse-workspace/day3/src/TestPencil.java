
public class TestPencil {
	public static void main(String[] args) {

		Marker m=new Marker();
		m.cost=1000;
		m.size=5;
		m.color();
		m.write();
		
		Pencil p=new Pencil();
		p.cost=10;
		p.size=3;
		p.write();

	}
}
