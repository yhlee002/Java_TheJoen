package inheritance03;

public class Bus extends Vehicle{
int  speed;
	
	public void speedUp() {
		speed += 10;
	}
	public void speedDown() {
		speed -= 10;
	}
}
