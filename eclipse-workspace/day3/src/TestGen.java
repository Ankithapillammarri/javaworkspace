
public class TestGen {
	public static void main(String[] args) {
		System.out.println("********Third Gen Mobile*********");
		GenThree t=new GenThree();
		t.camera();
		t.message();
		t.music();
		t.docall();
		System.out.println("*********Second Gen Mobile*********");
		GenTwo s=new GenTwo();
		s.docall();
		s.message();
		s.music();
		System.out.println("********First Gen Mobile*******");
		GenOne f=new GenOne();
		f.docall();
		f.message();
	}
}
