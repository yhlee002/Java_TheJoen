package exceptionTest;

public class MakeArrayExceptionTest {
	public static void main(String[] args) {
		MakeArrayException mAE = new MakeArrayException();
		try {
			mAE.make();			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 처리!");
		}
		System.out.println("끝!");
	}
}
