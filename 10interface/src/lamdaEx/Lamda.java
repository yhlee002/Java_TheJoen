package lamdaEx;

public class Lamda {
	public static void main(String[] args) {
		Calc num0 = new Calc() {
			public int add(int a, int b) {
				return a+b;
			};
		};
		//람다 표현식은 무명(익명) 클래스의 다른 표기 방법이다.
		Calc num = (a, b)->{
			return a+b;
		};
		
		System.out.println(num.add(10, 20));
	}
}
