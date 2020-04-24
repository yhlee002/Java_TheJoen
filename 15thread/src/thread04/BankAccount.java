package thread04;

public class BankAccount {
	int balance;
	
	//synchronized : 멀티스레드환경에서 동기화하여 하나의 스레드만 진행하도록 막음
	public synchronized void deposit(int amount) {//입금 기능
		balance += amount;
	}
	public synchronized void withraw(int amount) {//출금 기능
		balance -= amount;
	}
	public synchronized int getBalance() {//잔액 조회기능
		return balance;
	}
}
