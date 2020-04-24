package inner01;

/*
 * 내부 클래스만 따로 쓰일 이유가 없는 경우, 외부 클래스내에서 필요한 경우 내부에 작성될 수 있다.
 */
public class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum  = 100;
		void inTest() {
			System.out.println("inClass inNum : "+inNum);
			System.out.println("내부 클래스는 외부 클래스의 private속성에 접근 가능하다!!");
			System.out.println("OutClass num : "+num);
			System.out.println("OutClass sNum : "+sNum);
		}
	}
	
	public void usingClass() {
		inClass.inTest();
		
	}
}
