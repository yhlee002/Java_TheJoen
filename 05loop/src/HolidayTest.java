import java.util.Scanner;

public class HolidayTest {
	public static void main(String[] args) {
		//7) 1~100중 홀수의 합을 구하시오(continue 사용)
		System.out.println("7)");
		int i = 1;
		int sum = 0; //i = 2, sum = 1로 시작할 경우 시작부터 if문의 continue에 막힘+i증가X --> 무한 루프
		while(i <= 100) {
			if(i%2 == 0) {
				i++;
				continue; 
			}
			sum += i; //1로 시작해 3, 5, ..., 99까지
			i++;
		}
		System.out.println(sum);
		
		//8) 0부터 1씩 증가하여 합이 100을 초과하는 그 수와 합을 구하시오.(break)
		System.out.println("8)");
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
		
		//9) 사용자로부터 숫자 하나를 입력받아 그 수가 소수인지 판별하는 코드를 작성하시오.
		System.out.println("9)");
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
		System.out.println("10)");
		System.out.println("첫번째 수를 입력하시오.");
		int a = sc.nextInt();
		System.out.println("두번째 수를 입력하시오.");
		int b = sc.nextInt();
		
		i = 1;
		int result1 = 0;

		while(i <= a && i <= b) { //30, 24일 경우
			if(a%i == 0 && b%i == 0) {
//				System.out.println(i+"는(은) 첫번째 값인 "+a+"와 "+b+"의 공약수이다.");
				result1 = i;

			}
			i++;
		}
		System.out.println("두 값의 최대 공약수는 "+result1+"입니다.");
		
		//11) 위 두 수의 최소공배수를 구하시오.
		/*
		 * 두 수의 겹치는 약수들과 두 수의 겹치지 않는 약수들의 곱
		 *  : (a%i == 0 && b%i == 0)에서 추출된 값 * (a%i != 0 && b%i == 0)에서 추출한 값 * (a%i == 0 && b%i != 0)에서 추출한 값
		 *  위의 세 값들을 모두 곱하면 최소 공배수
		 */
		System.out.println("11)");
		System.out.println("두 값의 최소 공배수는 "+(a*b)/result1+"입니다.");
//		ex)30, 24 : 2*3*5 2*2*2*3 -> 2*2*2*3*5 = 120
		
		
		/*12) 사용자로부터 숫자를 입력받아 구구단을 다음과 같은 형식으로 출력하시오
		/
			입력값: 5
			5*1 = 5
			5*2 = 10
			5*3 = 15
			...
			5*9 = 45
		*/
		System.out.println("12)");
		System.out.println("1~9사이의 수를 입력하시오.");
		int e = sc.nextInt();
		if(e > 0 && e <10) {
			System.out.println("입력값 : "+e);
			for(i = 1; i < 10; i++) {
//				System.out.println(e+"*"+i+" = "+e*i);
				System.out.printf("%d * %d = %d \n", e, i, i*e);
			}
		}
		System.out.println("입력값 : "+e);
		for(i = 1; i < 10; i++) {
			for(int j = 2; j <= 4; j++) {
				System.out.printf("%d * %d = %d \t", j, i, j*i);
			}
			System.out.println();
		}
		
		

		
		//13) 다음과 같은 모양을 중첩반복문을 이용하여 출력하시오.
		i = 0;
		int j = 0;
		System.out.println("13)_1");
		for(i = 0; i < 5; i++) {
			System.out.println("**********");
		}
		
		System.out.println("13)_2");
		
		String str = "*";
		i = 0;
		do {
			System.out.println(str);
			str += "*"; 
			i++;
		}while(i<5);

		System.out.println("13)_3");
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("13)_4");
		for(i = 0; i < 5; i++) {
			int n =1;
			for(j = 0; j < 5-i; j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		
		System.out.println("13)_5");
		int n = 1;
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		
		System.out.println("13)_6");
		n  = 4;
		for( i = 0; i < n; i++) { //n줄
			for( j = -n+1; j < n+i; j++) { //j는 -3~4/5/6/7
				if(j == i || -j == i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		/*
		 * 0이 기준.(1행의 *의 위치는 0)
		 * 1행 : i는 0, j는 -3부터 4까지 (왜 3이 아닌 4?) - j가 i와 같은 0일때 한번 '*' 출력
		 * 2행 : i는 1, j는 -3부터 5까지 - j가 i 혹은 -i와 같은 1, -1일때 * 출력
		 * 3행 : i는 2, j는 -3부터 6까지 - j가 i 혹은 -i와 같은 2, -2일때 * 출력
		 * 4행 : i는 3, j는 -3부터 7까지 - j가 i 혹은 -i와 같은 3, -3일때 * 출력
		 */

		//14) 구구단을 2~9단까지 출력하는 코드를 작성하시오.
		System.out.println("14)");
		for(i = 1; i < 10; i++) {
			for(j = 2; j < 10; j++) {
				System.out.print(j+"*"+i+" = "+j*i+"    ");
			}
			System.out.println();
		}
		
		//15) 2x + 4y = 10의 해를 구하세요.(x, y는 0~10사이의 정수이다.)
		System.out.println("15)");
		int x;
		int y;
		int res;
		for(x = 0; x < 11; x++) {
			for(y = 0; y < 11; y++) {
				res = 2*x + 4*y;
				if(res == 10) {
					System.out.println("x : "+x+", y : "+y);
				}
			}
		}
		
		/*16) 2g추가 5개, 3g 추가 4개, 5g 추가 3개 있는 저울이 있다.
		이 저울을 이용해서 무게 20~30g를 측정할 수 있는 모든 경우
		의 수를 구하세요.*/
		System.out.println("16)");
		int z;
		int res2;
		int count = 0;
		for(x = 0; x <= 5; x++) {
			for(y = 0; y <= 4; y++) {
				for(z = 0; z <= 3; z++) {
					res2 = 2*x + 3*y + 5*z;
					if(res2 >= 20 && res2 <= 30) {
						System.out.println("x : "+x+", y : "+y+", z : "+z);
						count++; 
					}
				}
			}
		}
		System.out.println("경우의 수 "+count);
		
		//17) 1~100까지 중에 소수를 출력하시오.
		System.out.println("17)");
		for(i=2; i<100; i++) {
			int c=0;
			for(j=1; j<=i; j++) {
				if(i%j==0) {
			    c+=1;
				}
			}
			if(c==2) {
				System.out.print(i+" ");
			}
		}	
	}
}
