package exception03;

import java.io.IOException;

public class ReaderThrowsTest {
	public static void main(String[] args) {
		MyReaderThrows mrt = new MyReaderThrows();
		System.out.println("문자를 입력하세요.");
		String str = null;
		try { //throws를 해두면 사용하는 쪽에서 예외처리를 해야함!
			str = mrt.readString();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println(str);
	}	
}
