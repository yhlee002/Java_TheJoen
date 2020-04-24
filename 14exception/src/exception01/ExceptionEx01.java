package exception01;

public class ExceptionEx01 {
	public static void main(String[] args) {
		/*
		 * 프로그램상에서 발생하는 기본적인 예외
		 */
		int num1 = 10;
		int num2 = 0;
		System.out.println(num1/num2); //0으로 나눠서 발생한 ArithmeticException
		System.out.println("끝!");
	}
}
