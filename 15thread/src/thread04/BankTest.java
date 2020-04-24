package thread04;

public class BankTest {
	static BankAccount account = new BankAccount();
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new User(account));
		Thread t2 = new Thread(new User(account));
		
		t1.start();
		t2.start();
		
		/*
		 * [멀티 스레드의 약점] : 같은 데이터를 공유하기 때문에 동시 접근하게 될 경우 속도는 빨라지나 안정성이 낮아진다.
		 * 위의 경우 둘 다 만원씩 동시에 빼서 둘 입장 모두에서 (20000 - 10000) 10000원이 남았다고 출력(처리)할 수 있다.
		 * 하나의 스레드가 공유되는 데이터를 사용할 때는 다른 스레드가 이를 사용하지 못하도록 막을 수 있다.(Lock)
		 *   'synchronized' 키워드 사용해 동기처리를 하게 할 수 있다. (동기화)
		 *  
		 * [동기처리의  단점] : 처리하는 속도가 느려짐(안정성은 향상)
		 */
	}
}
