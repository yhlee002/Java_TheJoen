package io01;

import java.io.IOException;

public class SystemInTest {
	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요.");
		int i;
		
		try {
			//계속 있다가 -1이 반환되면 종료
			while((i = System.in.read()) != - 1) {//읽을 내용이 없거나 읽은 내용의 자료형을 변환하지 못할때 -1 반환
				//int read() :  1 byte씩 읽어서 int타입으로 받음. 이 int형 데이터가 i에 반환되고, 이것을 아랫줄에 char로 변환해 출력되도록 작성
				//int read(byte[] buf) : buf의 크기만큼 데이터를 읽어서 값은 buf에 저장하고, 읽은 '바이트 수'를 반환
				//14exception - exception03 My어쩌구에서 함
				System.out.print((char)i);
			}
			i = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		} //입력한 문자열을 문자 단위로 나눠 int형 데이터로 변환
	}
}
