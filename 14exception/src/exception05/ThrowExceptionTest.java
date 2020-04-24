package exception05;

public class ThrowExceptionTest {
	public static void main(String[] args) {
		//예외를 만들자!
//		String str = null;
//		str.charAt(5); //NullPointerException 발생.
		
//		ClassCastException cCE = new ClassCastException();
//		System.out.println(cCE.toString());
		// 위와 아래는 같은 말.
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("The end!");
	}
}
