package thread02;

/*
 * 인터페이스를 이용한 thread 생성
 * Runnable 인터페이스를 구현하는 클래스 생성
 * Thread 클래스의 객체 생성
 * Thread 객체의 매개변수로 Runnable 객체를 받음
 */

public class Count implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
		}
		
	}

}
