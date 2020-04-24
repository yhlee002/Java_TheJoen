package Ex02;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car();
		
		myCar.speed = 100;
		yourCar.speed = 50;
		System.out.println("myCar.speed : "+myCar.speed);
		System.out.println("yourCar.speed : "+yourCar.speed);
		
		myCar.speedEquals(yourCar);
		myCar.speedChange(yourCar);
		
		System.out.println("after speedChange, yourCar.speed : "+yourCar.speed);
		System.out.println("after speedChange, myCar.speed : "+myCar.speed);

	}
}
