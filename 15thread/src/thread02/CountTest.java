package thread02;

public class CountTest {
	public static void main(String[] args) {
		//인터페이스로 구현된 thread 사용
		Count c = new Count();//Runnable을 구현한 인스턴스 생성
		Thread t1 = new Thread(c);//Thread 인스턴스 생성
		
		System.out.println("thread 실행");
		t1.start();
		System.out.println("thread 종료");
	}
}
