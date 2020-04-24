package thread01;

public class CountThreadTest {
	public static void main(String[] args) {
		Thread t = new CountThread(); 
		//thread로 쓸 객체를 생성(이는 Thread의 기능이 있는 객체를 만든 것이지 thread가 생성된 것이 아니다.

		/*
		 * 새로운 thread를 생성하기 위해서는 start()를 호출해야한다.
		 * start()가 호출되면 새로운 메소드가 생성되고, run()이 실행된다.(자동적으로 호출됨)
		 */
		t.start();
		System.out.println("종료");
		
		/*
		 * '종료'가 t.run()의 출력문보다 빨리 나오는 이유
		 * main - t.start()실행
		 * t - 생성된 후 run()실행
		 * 위의 두 thread가 동시에 실행되는 것이 아니라 main이 조금 더 빨리 실행되기 때문.
		 */
		
	}
}
