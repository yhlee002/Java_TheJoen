package Ex01;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car();
		
		myCar.speed = 10;
		myCar.mileage = 100;
		myCar.color = "red";
		
		yourCar.speed = 50;
		yourCar.mileage = 200;
		yourCar.color = "black";
		
		myCar.speedUp();
		System.out.println(myCar.getInfo());
		
		yourCar.speedDown();
		System.out.println(yourCar.getInfo());
		
		myCar = yourCar;
		System.out.println(myCar.getInfo());
		System.out.println(yourCar.getInfo());
		
		
		
	}
	
}
