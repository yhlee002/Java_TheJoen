package inheritance03;

public class VehicleTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.speedUp();
		
		Truck t = new Truck();
		t.speedUp();
		
		Bus b = new Bus();
		b.speedUp();
		
		System.out.println(c.speed);
		System.out.println(t.speed);
		System.out.println(b.speed);
	}
}
