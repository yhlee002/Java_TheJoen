package Ex02;

public class Bank {
	public void withdraw(Person s) {
		s.money -= 10;
		System.out.println("10원을 인출했습니다.");
	}
}
