
public class OpEx06Test {
	public static void main(String[] args) {
		/* int형 변수 하나를 선언 후 1을 넣고 (1+2+3+4+5+6+7+8+9+10)을 대입 연산자를 이용하여 출력하시오.
		 * (1+2)의 값
		 * (1+2+3)의 값
		 * (1+2+3+4)의 값
		 */
		
		/*
		int num1;
		num1 = 1;
		System.out.println("(1+2) : "+num1+=2);
		System.out.println("(1+2+3) : "+num1+=3);
		System.out.println("(1+2+3+4) : "+num1+=4);
		...

		System.out.println("(1+2+3+4+...+10) : "num1+=10);
		*/
		int num1 = 0;
		for(int i = 1; i <= 10; i++) {
			num1 += i;
			if(i == 2||i == 3||i == 4) {
				System.out.println("num1"+"(i = "+i+") : "+num1);
			}
		}
		System.out.println("num1의 총합 = "+num1);
	}
}
