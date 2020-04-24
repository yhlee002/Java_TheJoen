
public class WhileEx02Test {
	public static void main(String[] args) {
		/* 반복계수
		 * int형 변수 num, num1, num2를 만들고 
		 * num = 3, num1 = 0, num2 = 7, num3 = 1
		 * num을 이용한 반복문으로 "안녕하세요" 7번 반복하는 코드 작성.
		 * num1을 이용해서 "hi"를 10번 1~10의 숫자를 출력하는 코드를 작성.
		 * num2를 이용해서 7~0까지의 숫자를 출력하는 코드 작성.
		 * num3를 이용해서 3~9까지의 숫자를 출력하는 코드 작성.
		 */
		int num = 3, num1 = 0, num2 = 7, num3 = 1;
		
		//num
		System.out.println("num을 이용한 반복문으로 \"안녕하세요\" 7번 반복하는 코드 작성.");
		while(num < 10) {
			System.out.println("안녕하세요");
			num++;
		}
		
		//num1
		System.out.println("num1을 이용해서 \"hi\"를 10번 1~10의 숫자를 출력하는 코드를 작성.");
		while(num1 < 10) {
			System.out.print(num1+1+" ");
			num1++;
		}
		System.out.println("");
		
		//num2
		System.out.println("num2를 이용해서 7~0까지의 숫자를 출력하는 코드 작성.");
		while(num2>=0) {
			System.out.print(num2+" ");
			num2--;
		}
		System.out.println("");
		
		//num3
		System.out.println("num3를 이용해서 3~9까지의 숫자를 출력하는 코드 작성.");
		while(num3<8) {
			System.out.print(num3+2+" ");
			num3++;
		}
		System.out.println("");
		
		//1~100중 2의 배수를 출력하시오.
		System.out.println("1~100중 2의 배수를 출력하시오.");
		int num4 = 0;
		while(num4<100) {
			if((num4+1)%2 == 0) {
				System.out.print(num4+1+" ");
			}
			num4++;
		}
		System.out.println("");
		
		//1~50중 3의 배수를 출력하시오.
		System.out.println("1~50중 3의 배수를 출력하시오.(1)");
		int num5 = 1;
		while(num5<=50) {
			if(num5%3 == 0) {
				System.out.print(num5+" ");
			}
			num5++;
		}
		System.out.println("");
		
		//다른 방식
		System.out.println("1~50중 3의 배수를 출력하시오.(2)");
		num5 = 0;
		while(num5 <= 50) {
			num5 += 3;
			System.out.print(num5+" ");
			if(num5+3 > 50) {
				return;
			}
		}
	}
}
