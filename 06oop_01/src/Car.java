
public class Car {
	//속도, 속도를 올리는 기능, 속도를 내리는 기능
	
	public Car() {
		System.out.println("Car() 생성자 호출");
	}
	public Car(int speed, String color) {
		this.speed = speed;
		this.color = color;
		System.out.println("Car(int speed, String color) 생성자 호출");
	}
	//생성자 : 객체가 생성될때 처음에 호출되는 아이. 초기화해주는 역할
	//형식 : 접근 제한자 + 클래스명()
	public int speed;
	public String color;
	
	public void speedUp() {
		speed++;
	}
	
	public void speedDown() {
		speed--;
	}
	//자신이 가진 속성을 출력하는 메서드
	public void printInfo() {
		System.out.println(this.color+", "+this.speed);
		//this 안붙여도 같은 결과
	}
}
