
public class OpEx06 {
	public static void main(String[] args) {
		//복합대입 - 개발자의 덕목 : 귀차니즘
		int num1 = 10;
		int num2 = 0;
//		num2 = num1 + num2;
		num2 += num1;
		System.out.println("num2 : "+num2);
		
		//복합 대입연산자는 산술연산자 모두 가능(+=, -=, *=, /=, %=)
		//cf.순서가 바뀌어서  =+로 쓰이는 경우 '양수'를 의미하는 +가 됨. ex)num1 =+ num2
		
		int num3 = 100; 
		//num3에 50을 증가시키고 출력하시오.
//		System.out.println("num3 += 50 : "+(num3 += 50));
		num3 += 50;
		System.out.println("num3 : "+num3);
		
		
		//num3에 10을 감소시키고 출력하시오.
//		System.out.println("num3 -= 10 : "+(num3 -= 10));
		num3 -= 10;
		System.out.printf("num3 : %d\n",num3);
		//printf(format), %d : printf에서의 %d는 ','뒤에 인자로 온 정수가 대입됨, \n : 개행문자(행을 바꾸는 기호)
		
		//num3을 num1로 나눈 몫을 num3에 대입 후 출력하시오.
//		System.out.println("num3 /= num1 : "+(num3 /= num1));
		System.out.print("num3 : "+num3); //개행없이 출력
		System.out.println(""); //개행(자동 줄바뀜)
		
		
		//num3에 2를 곱한 값을 대입 후 출력하시오.
//		System.out.println("num3 *= 2 : "+(num3 *= 2));
		num3 *= 2;
		System.out.print("num3 : "+num3);
		System.out.print("\n"); //개행문자를 넣음으로써 개행
		
		
		//num1을 4로 나눈 나머지를 num1에 넣고 출력하시오.
//		System.out.println("num1 %= 4 : "+(num1 %= 4));
		num1 %= 4;
		System.out.print("num1 = "+num1); //개행X
	}
}
