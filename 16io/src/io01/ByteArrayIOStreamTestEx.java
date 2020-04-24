package io01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayIOStreamTestEx {
	public static void main(String[] args) {
		//1~100까지 숫자가 들어가 있는 배열을 copy라는 배열에 저장하는데 temp로 쓸 배열은 10byte 크기이다.
		//temp배열을 이용해 읽고 쓰시오.
		
		byte[] Hund = new byte[100];
		for(int i = 0; i < 100; i++) {
			Hund[i] = (byte)(i+1);
		}
		
		byte[] temp = new byte[10];
		
		ByteArrayInputStream bs = new ByteArrayInputStream(Hund);
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		
		byte[] copy = {};
		for(int i = 0; i < 10; i++) {
			try {
				bs.read(temp);
				bo.write(temp); //출력스트림에 저장
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		copy = bo.toByteArray();
		System.out.println("copy = "+Arrays.toString(copy));
	}
}
