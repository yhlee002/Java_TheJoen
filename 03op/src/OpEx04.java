import java.util.Scanner;
public class OpEx04 {
	public static void main(String[] args) {
		//논리 연산자(&&, ||, !) : 결과 역시 boolean형
		/*
		 * &&(AND연산자) : 두 항이 모두 참인 경우에만 값이 참이 된다.
		 * ||(OR연산자) : 두 항이 하나라도 참이면 값이 참이 된다.
		 * !(NOT연산자) : 참인 경우 거짓이, 거짓인 경우 참이 그 값이 된다.
		 */
		int num1 = 50;
		int num2 = 30;
		int num3 = 60;
		
		//num1이 30보다 크고, 60보다 작은가?
		System.out.println(num1>30&&num1<60); // = 30 < num1 < 60 (이렇게 표현하는 것은 불가능)
		//num2가 50보다 작거나 100보다 큰가?
		System.out.println(num2<50||num2>100);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요!");
		int age = scan.nextInt();
		
		//클럽에 입장하려하는데 20세 이상이고 40세 미만만 입장 가능!(논리 연산자를 이용해 출력하시오)
		int result = 0;
		System.out.println(age >= 20 && age < (result = 40)); //&&는 좌항이 참이면 우항은 확인하지 않음 cf.'&'는 두 항 모두 확인
//		if(age>=20&&age<40) {
//			System.out.println("입장 가능");
//		}else {
//			System.out.println("입장 불가능");
//		}
		System.out.println("result : "+result); //ln25의 논리연산자가 우항도 실행했다면 result의 값은 40이었을것
		scan.close();
	}
}
