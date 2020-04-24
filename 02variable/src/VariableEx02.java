
public class VariableEx02 {
	public static void main(String[] args) {
		/*
		 * 자료형(type) 종류
		 *  : 기초형(primitive), 참조형(reference)
		 * 기초형은 값이 들어가는 형태, 참조형은 주소가 들어가는 형태
		 * 1)기초형
		 * ⓐ정수형(byte, short, int, long)
		 * cf) 1byte -> 8bit : 0과 1로 표현되는 8자리의 수(이진수)
		 *  *1byte는 256가지를 표현가능(but. 숫자는 -128~127표현 - bit의 맨 앞자리는 부호 비트로 사용되기 때문)
		 * ex) 0000 0000(0, = 1000 0000), 0000 0001(1), 0000 0010(2)
		 * cf) byte(~127), short(~4만 가량), int(~20억 가량), long(~매우 많이 표현)
		 *  *long으로도 표현할 수 없는 수는 앞과 뒤를 나누어 계산 후 합쳐 문자로 표현
		 *  ⓑ실수형(float, double) *float 보다 double이 더 정확
		 *   - 부동소수점 방식 사용(0000 0000의 앞의 네자리를 지수, 뒤의 네자리를 가수라고 하고 각각 16자리(-8~7) 표현 가능)
		 *   - 7의 n 자리 . 7의 n자리  로 표현(비는 공간이 많이 생겨 정확하지 않다.)
		 *  ⓒ논리형(boolean) : true와 false가 존재(javascript는 0과 1도 참과 거짓으로 표현 가능)
		 *  ⓓ문자형(char) : 유니코드(2byte) 사용
		 * 2)참조형 : 클래스(class)
		 */
		
		byte byteNum = 127;
		short shortNum = 20000;
		int intNum = 2000000000;
		long longNum = 999999999999l; //long은 뒤에 l(혹은 L)를 붙여야 함
		//Java에서는 기본적으로 정수를 int형으로 취급 --> int가 아닌 long임을 명시해줘야 함
		//기본적인 수치계산 역시 int로 이루어짐
		
		float floatNum = 1.27f; //Java에서는 기본적으로 실수를 double형으로 취급
		double doubleNum = 3.14;
		
		boolean booleanVar = true;
		
		char ch = 65; //문자를 정수로 치환 *ASC II Code(65는 'A')
		char ch1 = 'A'; //Java에서는 한글을 지원하는 유니코드 사용(아스키 코드는 한글 지원X)
		char ch2 = '가';
		
		
		
	}
}
