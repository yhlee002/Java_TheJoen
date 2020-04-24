package inheritance06;

public class PersonTest {
	public static void main(String[] args) {
		
		SportsCar sp = new SportsCar();
		CampingCar cc = new CampingCar();
		
		Person p = new Person();
		p.buyCar(sp);
		p.doThing();
		
		p.buyCar(cc);
		p.doThing();
		
		
	}
}
