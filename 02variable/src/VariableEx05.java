
public class VariableEx05 {
	public static void main(String[] args) {

		/*
		 * 실습
		 * 
		 * int형 변수세개를 선언하시오.
		 * short형 변수 세개를 선언하고, 값을 초기화 하시오. *초기화 : 변수를 생성함과 동시에 초기 값을 넣음(선언 + 대입)
		 * 
		 * short형 변수 세개를 모두 더해서 int형 변수 num1에 넣으시오.
		 * num1의 값을 출력하시오.
		 * 
		 * double형 변수 세개를 선언, (실수로) 초기화 한 후
		 * 세 수의 합을 정확한 값이 나오도록 출력하시오.
		 * 
		 * 위 세 수의 합을 num2변수에 담아 출력하시오.
		 * 
		 * 문자형 변수 ch를 선언한 수 'a'를 넣고
		 * num3 변수에 담아 출력하시오.
		 * 
		 * ch를 이용하여 대문자 A를 출력해보세요.
		 * 
		 * double형 상수 PI를 리터럴 3.141592로 초기화하시오.
		 */
		
		int num1, num2, num3;
		short short1 = 10;
		short short2 = 20;
		short short3 = 30;
		
		num1 = short1 + short2 + short3;
		System.out.println("num1 = "+num1);
		
		double d1 = 1.1;
		double d2 = 1.2;
		double d3 = 1.3;
		
		int d1int = (int)(d1*10); //11
		int d2int = (int)(d2*10); //12
		int d3int = (int)(d3*10); //13
		
		double num2Double = (double) ((d1int + d2int + d3int)/10.0); //3.6
		System.out.println("세 값의 합 = "+num2Double);
		num2 = (int) num2Double; //num2 = (int) (d1+d2+d3);로 해도 결국 동일
		System.out.println("num2 = "+num2);
		
		char ch = 'a'; //int형 변수에도 문자 리터럴이 들어갈 수 있음(묵시적 형변환)
		num3 = ch; //char(2byte) --> int(4byte)의 형변환이 자동으로 이루어짐
		System.out.println("num3 = "+num3);
		
		System.out.println("\'A\' 출력 : "+(char)(ch-32)); //97 - 32 = 65(int)
		//어떤 영문자든 32를 더하고 빼는것으로 대소문자 변경 가능
		
		final double PI = 3.141592;
		System.out.println("PI = "+PI);
	}
}
