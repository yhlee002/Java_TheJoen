package inheritance06;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("Car의 speed : "+c.speed);
		Car s = new SportsCar();
		System.out.println("s의 speed : "+s.speed);
		System.out.println("(SportsCar)s의 speed : "+((SportsCar)s).speed);
		
		c.move();
		s.move();
		((SportsCar)s).turboOn();
		//메소드는 재정의할 경우 덮어써짐(객체가 덮어쓴 메소드로 실행됨)
		
		//DownCasting해서 변수에 담아두고 계속 쓸 수도 있고, 그 순간만 DownCasting할 수도 있다.
		//((SportsCar)s).turbo(); --> 이 순간만 다운캐스팅해서 사용
		//SportsCar sp = (SportsCar)s; --> 변수에 넣어 변수로 계속 사용 가능
	}
}
