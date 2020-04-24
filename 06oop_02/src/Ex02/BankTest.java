package Ex02;

public class BankTest {
	//교재(Do it! 자바 프로그래밍) p.175-179
	public static void main(String[] args) {
		Bank b = new Bank();
		
		Person younghyun = new Person();
		younghyun.money = 1000000;
		
		while(younghyun.money > 10) {
			b.withdraw(younghyun);
		}
		
	}
}
