package thread05;

public class MyDaemon implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("까꿍");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	}

}
