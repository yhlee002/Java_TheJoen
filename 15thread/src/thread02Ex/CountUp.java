package thread02Ex;

public class CountUp implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
