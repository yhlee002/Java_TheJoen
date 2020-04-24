package exception01;

import java.util.Scanner;

public class Exception04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e){
			System.out.print("Exception 발생  : 0으로 나눔(ArithmeticException)");
		}
		sc.close();
	}
}
