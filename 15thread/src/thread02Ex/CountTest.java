package thread02Ex;

public class CountTest {
	public static void main(String[] args) {
		
		CountUp cu = new CountUp();
		CountDown cd = new CountDown();
		
		Thread t1 = new Thread(cu); //Thread t1 = new Thread(new CountUp())과 동일
		Thread t2 = new Thread(cd); //Thread t2 = new Thread(new CountDonw())과 동일
		
		//0.5초씩 증가시킨 인터페이스 방식으로 카운트 업
		t1.start();
		//0.5초씩 증가시킨 인터페이스 방식으로 카운트 다운
		t2.start();
	}
}
