package exception03;

public class CalcTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.div(10, 0); // ArithmeticException -> 비체크드 exception은 try-catch가 의무가 아니다!
		// throws를 받아도 예외처리를 할 의무가 없다!!!
	}
}
