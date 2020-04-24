package io01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayOutputStreamTest {
	public static void main(String[] args) {
		/*
		 * OutputStream
		 * 배열에 프로그램이 쓴다.
		 * 프로그램 ----> 목적지(콘솔, 파일 등)
		 * ByteArrayOutputStream만 배열을 사용하기 때문에 연결을 따로 하지 않는다.
		 * (InputStream에서는 연결을 해야 했음)
		 */
		
		byte[] ori = {2, 10, 15, 45, 30, 17};
		byte[] copy = new byte[ori.length];
		
		//ori는 배열로부터 읽어들이기 위해 InputStream객체 생성
		ByteArrayInputStream in = new ByteArrayInputStream(ori);
		//output은 원래 목적 대상이 인자로 들어가지만, ByteArrayOutputStream만 예외!(자체적으로 내부에 저장)
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		int data;
		
		for(int i = 0; i < 6; i++) {
			data = in.read();//한 바이트 읽고
			out.write(data);//읽은 값을 OutputStream에 쓴다.
		}
		copy = out.toByteArray();//outputStream에 저장된 내용을 byte 배열로 변환해 반환함.
		System.out.println(Arrays.toString(copy));
		data = in.read();
		out.write(data); //-1출력
		
	}
}
