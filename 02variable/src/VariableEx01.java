
public class VariableEx01 {

	public static void main(String[] args) {
		/*
		 * Java에서 변수란
		 * --> 데이터를 저장할 수 있는 공간으로 값이 변할 수 있다.
		 * (상수도 마찬가지이나, 값을 변경할 수 없다.)
		 * 
		 * 변수의 선언
		 *  : 자료형 + 이름 
		 *  ex) int num;
		 */
		int num; // num이라는 변수를 메모리 공간에 만드는 것
		num = 10; // num이라는 변수에 값을 넣는 것
		num = 15; //num에 들어간 10이란 값을 15로 변경
		
		/* 
		 * 상수(final : 자료형 앞에 와서 값이 변할 수 없게끔 만드는 역할
		 * 상수는 대문자로 쓰는 것이 약속
		 */
		final int NUMBER;
		NUMBER = 10;
		//number = 11; --> 상수를 값을 변경(수정)할 수 없음
		
		/* 
		 * 변수명을 만드는 규칙
		 * 영어의 소문자로 시작하며 단어와 단어가 붙으면 첫글자를 대문자로 함
		 * --> 이를 '카멜 표기법'이라고 함(숫자로 시작하는 것은 불가능)
		 * ex) outOfAnjung
		 */
		
	}

}
