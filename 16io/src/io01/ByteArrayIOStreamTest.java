package io01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayIOStreamTest {
	public static void main(String[] args) {
		/*
		 * read(), write() : 인자값을 넣을 수 있다.
		 * read() :  InputStream에 연결된 배열로부터 buf만큼 읽어서 buf에 저장하고 읽은 개수를 반환
		 * write() : buf에 있는 내용을 스트림에 저장하고, 스트림에 저장한 만큼을 반환
		 * cf.InputStream생성 방법 : new ByteArrayInputStream(배열);
		 */
		byte[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] copy = {};
		
		//InputStream 객체를 data 배열에 연결해서 생성
		ByteArrayInputStream bs = new ByteArrayInputStream(data);
		ByteArrayOutputStream bi = new ByteArrayOutputStream();
		byte[] temp = new byte[10];
		
		try {
			int cnt = bs.read(temp); //data : 10개(읽은 값은 temp에 저장하고 읽은 개수를 반환)
			System.out.println("읽은 개수 : "+cnt);
			System.out.println("읽은 값 : "+Arrays.toString(temp));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			bi.write(temp); //temp의 내용을 ByteOutputStream에 저장
			copy = bi.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("복사된 배열 : "+Arrays.toString(copy));
		
	}
}
