package thread01;

//thread로 만들기 위해서는 Thread 클래스를 상속받아야 한다.
public class CountThread extends Thread{ //Thread를 상속함으로써 Thread의 기능을 할 수 있게 됨
	
	//실제 thread로 어떤 작업을 하기 위해서는 run()을 오버라이딩해야한다.
	//run() : 실행되면 하나의 thread가 더 생겨서 실행된다.
	@Override
	public void run() {
		//thread가 하나 더 생성되어서 실행될 내용을 작성
		//10에서 1까지 카운트
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}
}
