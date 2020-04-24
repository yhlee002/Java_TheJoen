
public class VariableEx04 {
	public static void main(String[] args) {
		//실수형 변수의 계산
		double num1 = 0.03;
		double num2 = 0.01;
		System.out.println("num1 - num2 = "+(num1 - num2)); //0.019999999999999997 출력(부동소수점을 사용하기 때문에 부정확한 결과)
		
		//명시적 형변환
		int number1 = (int) (num1 * 100); //double과 int를 계산할때는 자료형이 double이 됨
		System.out.println("number1 = "+number1);
		int number2 = (int) (num2 * 100);
		double number3 = (number1 - number2)/100.0; 
		//int값끼리만 계산할 경우 자료형이 int가 되어 0이 나옴(100대신 100.0을 넣는 이유)
		System.out.println("number3 = "+number3);
		
		//자동 형변환(묵시적 형변환)
		byte byteNum = 10;
		int intNum = byteNum;
		
		//형변환은 서로 다른 자료형을 변경시키는 방법
		//실수 -> 정수 등 보다 작은 범위의 자료형으로 바꿀때 명시적 형변환 필요
		byte byteNum2 = 10;
		short shortNum2 = 200;
		int intNum2 = 50000;
		long longNum2 = 1000000L;
		
		intNum2 = shortNum2; //묵시적 형변환
		intNum2 = (int) longNum2; //명시적 형변환
		
		float floatNum2 = 3.14f;
		double doubleNum2 = 3.14444;
		
		intNum2 = (int) floatNum2; //명시적 형변환(int < float)
		doubleNum2 = intNum2; //묵시적 형변환
		
		//문자형 char의 형변환
		char a = 97;
		System.out.println("a = "+a); //아스키 코드 97인 'a' 출력
		System.out.println("(int) a = "+(int) a); //a를 int형으로 형변환 함으로써 a의 값 출력 가능
		int intA = (int) a;
		System.out.println("intA = "+intA);
		
		//소문자 e를 출력
		//char e = 101;
		int intE = intA + 4;
		System.out.println("(char)intE = "+(char)intE); //intE를 char형으로 변환해 숫자상태인 e값을 아스키코드로 읽어냄
		
	}
}
