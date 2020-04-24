package Test;

public class Ex01 {
	//static 메서드
	//static 두수의 합, static 두수의 차, static 두수의 곱,
	//나누기, 나머지는 일반 메서드
	//사용해보세요.
	
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return (a>=b)?a-b:b-a;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return (b!=0)?a/b:0;
	}
	public int rem(int a, int b) {
		return (b!=0)?a%b:0;
	}
	
}