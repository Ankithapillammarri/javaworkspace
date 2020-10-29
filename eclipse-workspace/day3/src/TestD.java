
public class TestD {
public static void main(String[] args) {
	
	
	Demo.count=100;
	Demo.eat();
	
	Demo a=new Demo();
	a.move();
	a.size=90;
	
	Demo b=new Demo();
	b.move();
	b.size=89;
	
	System.out.println("Count is "+Demo.count);
	System.out.println("Size is "+a.size);
	System.out.println("Size is "+b.size);
}
}
