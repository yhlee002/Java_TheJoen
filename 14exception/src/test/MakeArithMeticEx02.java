package test;

import java.util.Scanner;

public class MakeArithMeticEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1 : ");
		int num1 = sc.nextInt();
		System.out.println("num2 : ");
		int num2 = sc.nextInt();
		
		try{
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("num2로 0이 입력되었습니다.");
		}
		
		sc.close();
	}
}