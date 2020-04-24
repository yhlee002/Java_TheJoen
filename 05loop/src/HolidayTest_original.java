import java.util.Scanner;

public class HolidayTest_original {
	public static void main(String[] args) {
//		//7) 1~100중 홀수의 합을 구하시오(continue 사용)
		int i = 1;
		int sum = 0; //i = 2, sum = 1로 시작할 경우 시작부터 if문의 continue에 막힘+i증가X --> 무한 루프
		while(i <= 100) {
			if(i%2 == 0) {
				i++;
				continue; 
			}
			System.out.println("현재 sum : "+sum+", 현재 i : "+i+"인 상태.");
			sum += i; //1로 시작해 3, 5, ..., 99까지
			System.out.println("sum은 이제 "+sum+"이 된다.");
			i++;
		}
		System.out.println("===================");
		
		//8) 0부터 1씩 증가하여 합이 100을 초과하는 그 수와 합을 구하시오.(break)
		i = 0;
		sum = 0;
		while(i < 100) {
			sum += i; //0+1+2+...+98+99+100
			if(sum > 100) {
				System.out.println("i : "+i+", sum : "+sum);
				break;
			}
			i++;
		}
		System.out.println("===================");
		
		//9) 사용자로부터 숫자 하나를 입력받아 그 수가 소수인지 판별하는 코드를 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오.");
		int inputnum = sc.nextInt();
		int ipn; //inputnum보다 작은 모든 수 
		i = 2;
		int select = 0;
		while(i < inputnum) {
			if(inputnum%i == 0) { //2부터 inputnum보다 1 작은 값까지 1씩 증가하는 i로 inputnum을 나누었을때 나누어 떨어지는 경우
				select = 1; //true로 해서 if문 사용도 가능
				break;
			}
			select = 2;
			i++;
		}
		switch(select) {
		case 1 : 
			System.out.println("이 수는 소수가 아닙니다.");
			break;
		case 2 :
			System.out.println("이 수는 소수입니다.");
			break;
		}
		
		//10) 사용자로부터 두 수를 입력받아 두 수의 최대 공약수를 구하시오. ( 두 수를 입력받아 두 수가 공통적으로 가지는 약수 ex.6과 8이면 2)
		System.out.println("첫번째 수를 입력하시오.");
		int a = sc.nextInt();
		System.out.println("두번째 수를 입력하시오.");
		int b = sc.nextInt();
		
		i = 1;
		int result = 0;
		while(i <= a && i <= b) {
			if(a%i == 0 && b%i == 0) {
//				System.out.println(i+"는(은) 첫번째 값인 "+a+"와 "+b+"의 공약수이다.");
				result = i;
				i++;
				continue;
			}
			i++;
		}
		System.out.println("두 값의 최대 공약수는 "+result+"입니다.");
		
		//11) 위 두 수의 최소공배수를 구하시오.
		/*
		 * 두 수의 최대공약수 * 겹치지 않는 약수들
		 *  : result * (a%i != 0 && b%i == 0)에서 추출한 값 * (a%i == 0 && b%i != 0)에서 추출한 값
		 */
		i = 1;
		while(i <= a && i <= b) {
			if(a%i == 0 && b%i == 0) {
//				System.out.println(i+"는(은) 첫번째 값인 "+a+"와 "+b+"의 공약수이다.");
				result = i;
				i++;
				continue;
			}
			i++;
		}
		
		
		/*12) 사용자로부터 숫자를 입력받아 구구단을 다음과 같은 형식으로 출력하시오
		/
			입력값: 5
			5*1 = 5
			5*2 = 10
			5*3 = 15
			...
			5*9 = 45
		*/
		System.out.println("수를 입력하시오.");
		int e = sc.nextInt();
		if(e > 0 && e <10) {
			System.out.println("입력값 : "+e);
			for(i = 1; i < 10; i++) {
				System.out.println(e+"*"+i+" = "+e*i);
			}
		}else {
			System.out.println("잘못된 입력입니다. 1과 9사이의 값을 입력해주십시오.");
		}
	}
}
