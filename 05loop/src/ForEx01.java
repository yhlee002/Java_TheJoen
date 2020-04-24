
public class ForEx01 {
	public static void main(String[] args) {
		/*
		 * for문
		 * 초기화식, 조건식, 증감식
		 * 형식 : for(초기화식; 조건식; 증감식) { 실행문; }
		 * 실행 순서 : 초기화식 - '조건식 - 실행문장 - 증감식' - '조건식 - 실행문장 - 증감식' - '조건식...'의 반복
		 * 주로 조건이 횟수인 경우 사용 (*~할때까지는 주로 while문)
		 */
		
		//0~9까지의 숫자를 출력하는 반복문.
		int i = 0; //지역 함수(블럭 내에서 선언하는 함수는 블럭 함수)
		
		System.out.println("While문");
		while(i < 10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println("");
		
		System.out.println("For문");
		for(i = 0; i < 10; i++) {
			System.out.print(i+" ");
		}
		
		
	}
}
