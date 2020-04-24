package condition;

import java.util.Scanner;

public class IfEx01 {
	public static void main(String[] args) {
		/*
		 * 분기문 : 조건의 결과에 따라 실행 문장을 다르게 하는 제어문
		 * if문
		 * 형식 : if(조건식) { 조건식이 참일 경우 실행할 문장; } - 문장이 하나일 경우 중괄호 생략 가능
		 */
		int macBookPrice = 5000000;
		int money = 60000000;
		
		//돈이 더 많으면 "구매 가능"이 출력
		if(money >= macBookPrice) {
			System.out.println("구매 가능");
		}
		/*cf. 삼항 연산자의 경우 결과가 값으로 나옴. if문은 변수에 값을 넣는 문장이 필요.
		--> 간단한 if문은 삼항연산자로 표현하는 것이 더 간결*/
		
		/*
		 * if - else문
		 * 형식 : if(조건식) { 조건식이 참일 때 실행할 문장; }else{ 조건식이 거짓일 때 실행할 문장; }
		 * - 조건식이 참이라면 else는 실행되지 않는다.
		 */
		
		//입력을 받아서 참일 때와 거짓일 때를 분기처리하는 프로그램('배고프다'를 입력했으면 '밥 먹는다' 출력, 그 외 다른 문장 입력시 '밥 안먹는다' 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("배고파?");
		String s = scan.next();
		if(s.equals("배고프다")) { //equals() : 내용이 같은지 확인
			System.out.println("밥 먹는다.");
		}else {
			System.out.println("밥 안먹는다.");
		}
		/*
		 * if(조건식 1) { 조건식 1이 참일 때 실행할 문장; }
		 * else if(조건식 2) { 조건식 1이 거짓이고, 조건식 2는 참일때 실행할 문장; }
		 * else if(조건식 3) { 조건식 1, 2 모두 거짓이고, 조건식 3은 참일때 실행할 문장; }
		 * else { 위의 조건식이 모두 거짓일 때 실행할 문장; }
		 * - 위에서 아래로 실행되며 중간에 참이 나오면 이후 문장들은 실행되지 않는다.
		 */
		
		int num = 20;
		if(num > 50) {
			System.out.println("50 보다 크다.");
		}else if(num >= 20) {
			System.out.println("20 이상이다.");
		}else if(num > 10) {
			System.out.println("10 보다는 크다.");
		}else {
			System.out.println("이도 저도 아니다.");
		}
		scan.close();
	}
}
