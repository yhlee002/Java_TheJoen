package thread03;

public class Horse implements Runnable{
	String name;
	private int sleepTime;
	
	public Horse(String name) {
		this.name = name;
		sleepTime = (int)Math.random()*3000+1; //1<=sleepTime<=3000 (정수만)
	}
	@Override
	public void run() {
		System.out.println("시작!");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"도착!");
	}
}
