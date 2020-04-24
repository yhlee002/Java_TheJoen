package thread05;

public class MyCount implements Runnable{

	@Override
	public void run() {
		//주스레드가 종료될 때 종 스레드도 같이 종료되게 하기 위해서 주 스레드(MyCount)내에 종 스레드(MyDaemon) 실행
		//만약 main thread가 종료될 때 daemon thread가 종료되게 하기 위해서는 main method 내에 daemon thread를 실행
		Thread t = new Thread(new MyDaemon());
		t.setDaemon(true); //이 thread를 daemon thread로 셋팅하겠다.
		t.start();
		
		System.out.println("시작");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("종료");

		
	}

}
