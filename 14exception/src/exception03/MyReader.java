package exception03;

import java.io.IOException;

public class MyReader {
	public String readString() {
		byte[] buf = new byte[100]; //char ->2byte
		
		//콘솔에서 문자를 읽어 buf라는 배열에 저장.
		try {
			System.in.read(buf);
		} catch (IOException e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}
		
		return new String(buf);//buf의 바이트 배열을 char로 변환하고 문자로 묶어서 표현해줌.
	}
}
