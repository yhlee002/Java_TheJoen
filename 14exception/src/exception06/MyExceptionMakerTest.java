package exception06;

public class MyExceptionMakerTest {
	public static void main(String[] args) {
		MyExceptionMaker mem = new MyExceptionMaker();
		
		String s = null;
		try {
			s = mem.makeStr(10);
		} catch (MyException e) {
			System.out.println("입력된 값이 음수로 되었습니다. 다시 입력하세요.");
		} //throws 된 exception을 처리하거나 다시 throws해야 한다.
		System.out.println("이 값을 문자열로 변경하면 : "+s);
	}
}
