package io01;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest {
	public static void main(String[] args) {
		//바이트 배열에서 읽는 스트림(Input스트림)
		byte[] inByteData = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		//byte[] 에서 읽으려면 배열과 InputStream을 연결해야 한다.
		ByteArrayInputStream input = null;
		
		//InputStream 객체 생성
		//InputStream 객체를 생성할 때 읽어들일 대상을 매개변수로 넣어서 생성한다.
		input = new ByteArrayInputStream(inByteData);
		int rs = input.read(); // 1바이트 읽고 이를 배열에 넣음
		System.out.println("읽은 값 : "+rs);
		System.out.println("읽은 값 : "+input.read()); //ArrayList.remove()처럼 하나씩 읽음
		
		
	}
}
