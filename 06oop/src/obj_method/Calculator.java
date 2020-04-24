package obj_method;

public class Calculator {
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	//double형 param 두 개를 받아서 합을 반환하는 메소드 생성
	public double add2(double left1, double right1) {
		double result2 = left1 + right1;
		return result2;
	}
	//int형 param 두 개를 받아 두 수의 차를 반환하는 메소드 생성
	public double minus(int left2, int right2) {
		int result3 = left2 > right2 ? left2 - right2 : right2 - left2;
		return result3;
	}
	//int형 param 두 개를 받아 두 수의 곱을 반환하는 메소드 생성
	public int a(int one, int two) {
		int result4 = one * two;
		return result4;
	}
	//int형 param 두 개 받아 나눈 몫을 반환하는 메소드
	public int b(int t, int f) {
		int result5 = t >= f ? t / f : f / t; 
		return result5;
	}
}
