package obj_method;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator cl = new Calculator();
		System.out.println(cl.add(3,5));
		int ab = cl.add(3, 5);
		System.out.println(ab);
		
		//double형 param 두 개를 받아서 합을 반환하는 메소드 실행
		System.out.println("cl.add2() : "+cl.add2(1.0, 3.5));
		//int형 param 두 개를 받아 두 수의 차를 반환하는 메소드 실행
		System.out.println("cl.minus() : "+cl.minus(5, 3));
		//int형 param 두 개를 받아 두 수의 곱을 반환하는 메소드 실행
		System.out.println("cl.a() : "+cl.a(8, 14));
		//int형 param 두 개 받아 나눈 몫을 반환하는 메소드(double -> int) 실행
		System.out.println("cl.b() : "+cl.b(30, 120));
	}
}
