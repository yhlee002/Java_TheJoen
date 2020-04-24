package var01;

public class Variable {
	/*
	 * 메소드 내에 선언되는 변수 : 지역 변수
	 * 멤버 변수(field) - 객체를 생성할때 포함된다.
	 */
	
	int num;
	
	public static void a() {
		int numA = 10; //메소드 내의 변수는 해당 메소드가 호출될 때 생성되고 사용이 종료되면 소멸된다.
	}
	public static void main(String[] args) {
		//객체가 생성될 때 객체속의 멤버 변수들도 생성된다.
		int num;
		Variable v;
		v = new Variable();
		a(); //numA는 이때 생성된다.
	}
}
