
public class CarTest {
	public static void main(String[] args) {
		Car c01 = new Car(30, "red");
//		c01.speed = 30;
//		c01.color = "빨강";
//		System.out.println(c01.speed +", "+ c01.color);
//		c01.speedUp();
//		System.out.println(c01.speed);
//		c01.speedDown();
//		System.out.println(c01.speed);
		
		c01.printInfo();
		
		Car obbaCar = new Car(15, "blue");
		obbaCar.printInfo(); 
		//객체의 멤버 변수는 명시적으로 초기화 하지 않은 경우 기본값으로 초기화됨
		//참조변수(String)의 경우 null(참조주소가 없음), 수(int등)의 경우 0이 기본값이 됨
		//참조하는 객체가 없음 --> 실행시 오류 발생(java.lang.NullPointerException)
		Car younghyunCar = new Car();
		//자바에서 생성자를 명시하지 않으면 자동으로 기본 생성자가 생성된다.(매개변수를 받지 않는 형태)
		//ex) Car(){}의 형태
		//매개변수를 가지는 생성자를 명시하면 기본 생성자는 자동 생성되지 않음
	}
}
