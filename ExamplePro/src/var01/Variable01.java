package var01;

public class Variable01 {
	
	public static void aMethod() {
		int a = 20;
		System.out.println("a변수 생성 : "+a); //20
		bMethod();
	}
	
	public static void bMethod() {
		int a = 10;
		System.out.println("a변수 생성 : "+a); //10
		cMethod();
	}
	
	public static void cMethod() {
		int a = 0;
		System.out.println("a변수 생성 : "+a); //0

	}
	
	public static void main(String[] args) {
		int a = 100;
		System.out.println("a변수 생성 : "+a);
		aMethod(); //a는 0출력(cMethod)
		
		/*
		 * 스택(Stack) : 선입후출
		 * 위의 aMethod를 실행한 경우, a = 100, a = 20, a = 10, a = 0 순으로 데이터가 들어와서 a = 0부터 순차적으로 삭제된다.
		 */
	}
}
