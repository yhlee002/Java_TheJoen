package thread04;

public class User implements Runnable{

	BankAccount account;
	
	public User(BankAccount account) { //BankAccount 기능을 사용할 수 있게 해줌
		this.account = account;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.deposit(10000);
			try {
				Thread.sleep(99);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.withraw(10000);
			System.out.println(account.getBalance());
		}
		
	}
}
