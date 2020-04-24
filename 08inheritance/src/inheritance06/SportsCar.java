package inheritance06;

public class SportsCar extends Car {
	int speed = 100;
	int turbo;
	
	public void move() {
		System.out.println("SportsCar가 움직입니다.");
	}
	
	public void turboOn() {
		System.out.println("부스터 온!");
		turbo = 100;
	}
}
