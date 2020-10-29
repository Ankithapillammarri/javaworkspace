
public class Student1 {
	int id;
	String name;
	double height;

	Student1(int id,String name,double height){
		this.id=id;
		this.name =name;
		this.height=height;

	}

	void display() {
		System.out.println("ID is "+id);
		System.out.println("Name is "+name);
		System.out.println("Height is "+height);
	}
}
