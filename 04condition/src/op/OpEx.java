package op;
import java.util.Scanner;

public class OpEx {
	public static void main(String[] args) {
		/*
		 * 삼항 연산자(항이 세개)
		 * '조건식 ? 참일때 실행될 문장 : 거짓일때 실행될 문장' 형태( ? : )
		 */
		
		int age = 10;
		
		String str = "?";
		System.out.println("str의 값은 : "+str);
		str = (age > 20) ? "어른이다." : "어린이다.";
		System.out.println("str의 값은 : "+str);
		
		//맥북이 500만원인데, 현재 가지고 있는 금액을 입력하여 500만원보다 크면 구매가능을 출력, 적으면 '다른거 사' 출력
		Scanner scan= new Scanner(System.in);
		
		String a = "";
		int macbook = 5000000;
		System.out.println("현재 가지고 있는 금액을 입력하시오.");
		int money = scan.nextInt();
		a = (money >= macbook) ? "구매가능" : "다른거 사";
		System.out.println(a);
	}
}
