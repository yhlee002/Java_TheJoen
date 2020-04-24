import java.util.Scanner;

public class OpEx01Test {
	public static void main(String[] args) {
		//사용자로부터 두 수를 입력받아 두 수의 +, -, *, /, &를 구해보자.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하시오.");
		int num1 = scan.nextInt();
		System.out.println("두 번째 숫자를 입력하시오.");
		int num2 = scan.nextInt();
		System.out.println("num1 : "+num1+"\nnum2 : "+num2+"\nnum1 + num2 = "+(num1+num2));
		System.out.println("num1 - num2 = "+(num1 - num2));
		System.out.println("num1 * num2 = "+num1 * num2);
		System.out.println("num1 / num2 = "+num1 / num2);
		System.out.println("num1 % num2 = "+num1 % num2);
		
		scan.close();
	}
}
