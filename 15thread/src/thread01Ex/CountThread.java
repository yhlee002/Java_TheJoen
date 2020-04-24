package thread01Ex;

public class CountThread extends Thread{
	public static void main(String[] args) {
		//1~10까지의 숫자가 증가하는 스레드 하나 만들어서 실행
		Thread t1 = new PlusThread();
		t1.start();
		//10~1까지의 숫자가 감소하는 스레드 하나 만들어서 실행
		Thread t2 = new MinusThread();
		t2.start();
		System.out.println("main method Thread Start");
		System.out.println("main method Thread End");
		
		try {
			Thread.sleep(5000); //이를 통해 sleep이 static 메소드임을 알 수 있다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //t1객체를 재우는 것이 아니라, 현재 스레드(main)를 1초 재우는 것을 의미
//		t2.sleep(1000);
		/*
		 * class.sleep()이나 instanceObject.sleep()으로 쓰나 모두 '현재 thread'를 쉬게 하는 것으로 기능이 완전히 똑같음. 다만 헷갈릴 수 있음
		 * main Thread : 총 6초 쉬는 것
		 * t1 thread : 5초 쉬는 것
		 * t2 thread : 5초 쉬는 것
		 */
		
	} 
}
