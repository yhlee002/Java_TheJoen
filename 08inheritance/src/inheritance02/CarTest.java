package inheritance02;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		Truck t = new Truck();
		Bus b = new Bus();
		
		c.speedUp();
		t.speedUp();
		b.speedUp();
		
		System.out.println(c.speed);
		System.out.println(t.speed);
		System.out.println(b.speed);
	}
	
	
}
