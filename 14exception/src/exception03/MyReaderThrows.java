package exception03;

import java.io.IOException;

public class MyReaderThrows {
	//예외처리를 메서드 호출하는 곳으로 위임함.
	//IOException이라는 예외의 예외처리를 미룸.
	public String readString() throws IOException {
		byte[] buf = new byte[100];
		System.in.read(buf);
		
		return new String(buf).trim(); //trim() -> 비어있는 공백을 제거해줌.
	}
}
