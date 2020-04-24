package Ex02;

public class Car {
	int speed;
	
	void speedEquals(Car c) {
		System.out.println("자기 speed : "+speed);
		System.out.println("전달받은 c.speed : "+c.speed);
		System.out.println("같음? : "+(c.speed == speed));
	}
	
	void speedChange(Car c) {
		c.speed = 500;
	}
}
