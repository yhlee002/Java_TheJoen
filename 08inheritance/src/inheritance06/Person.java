package inheritance06;

public class Person {
	Car car;
	
	public void buyCar(Car car) { //car를 부모로 가지는 클래스의 객체들도 들어올 수 있다.(자동 UpCasting)
		this.car = car;
	}
	
	public void doThing() {
		System.out.println("사람이 차로 뭔가를 하려해!");
		if(car instanceof SportsCar) {
			((SportsCar)car).turboOn();
		}else if(car instanceof CampingCar){
			((CampingCar)car).cook();
		}else if(car instanceof Car) {
			System.out.println("뭘해 암것도 없으면서");
		}
		
		
	}
}
