package exceptionTest;

public class MakeDDong {
	ThrowDDong tD;
	public void makeEx() throws Exception{
		tD = new ThrowDDong();
		switch (tD.ranNum()) {
		case 1 :
			throw new ArithmeticException();
		case 2 :
			throw new NullPointerException();
		case 3 :
			throw new ClassCastException();
		}
	}
}
