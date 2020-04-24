package Ex01;

public class Car {
	//필드 : speed, mileage, color;
	int speed;
	int mileage;
	String color;
	
	//메소드 : speedUp, speedDown - 속도를 10씩 증감
	public void speedUp() {
		speed += 10;
	}
	public void speedDown() {
		speed -= 10;
	}
	//필드의 값을 문자열로 반환하는 메소드
	public String getInfo() {
		return "speed : "+speed+", mileage : "+mileage+", color : "+color;
	}
	
}
