package thread03_2;

public class Horse implements Runnable{
	String name;
	int sleepTime;
	
	public Horse(String name) {
		this.name = name;
		sleepTime = (int)Math.random()*5000 + 1;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "[도착!]");
		
	}
	
}
