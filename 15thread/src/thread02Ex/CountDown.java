package thread02Ex;

public class CountDown implements Runnable{
	@Override
	public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.print(i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
