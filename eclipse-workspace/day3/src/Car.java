
public class Car {
	String regno;
	int cost;
	String color;
	
	void move() {
		System.out.println("I am in move() method");
		
	}
	void stop() {
		System.out.println("I am a stop() method");
	}
	void display() {
		System.out.println("..............");
		System.out.println("Regno is "+regno);
		System.out.println("Cost is "+cost);
		System.out.println("Color is "+color);
		System.out.println("..............");
	}

}
