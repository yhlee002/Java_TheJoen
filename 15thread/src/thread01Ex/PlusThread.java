package thread01Ex;

public class PlusThread extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			try {
				sleep(1000);//1000분의 1초를 재우는 것.(지정한 시간동안 현재 스레드를 멈추도록 하는 메소드)
			} catch (InterruptedException e) { //프로그램이 끼어들 수 있기 때문에 이를 막아주는 예외
				e.printStackTrace();
			}
		}
	}
}
