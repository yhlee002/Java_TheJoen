package exceptionTest;

public class ThrowDDongTest {
	public static void main(String[] args) {
		MakeDDong mD = new MakeDDong();
		try {
			mD.makeEx();
		} catch (ArithmeticException e) {
			System.out.println("1번 똥 : ArithmeticException");
		} catch (NullPointerException e) {
			System.out.println("2번 똥 : NullPointerException");
		} catch (ClassCastException e) {
			System.out.println("3번 똥 : ClassCastException");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("끝!");
	}
}

