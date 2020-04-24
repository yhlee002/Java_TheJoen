package thread01Ex;

public class MinusThread extends Thread{
	@Override
	public void run() {
		for(int i = 10; i >= 1; i--) {
			System.out.print(i+" ");
			try {
				sleep(1000);//1초씩 멈추게 하는 메소드
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
