package io02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		//파일을 읽는 클래스
		FileInputStream fi = null;
		
		try {
			//파일 객체 또는 파일의 주소(절대주소, 상대주소)
			//cf.절대주소 : 시스템상 주소
			//cf.상대주소 : 프로그램상 주소
			int a = 0;
			fi = new FileInputStream("src/io02/untitled.txt");
			try {
				a = fi.read();
				System.out.println(a); // int형에 char형이 들어가면서 아스키 코드로 변환되어서 출력(h -> 104)
				System.out.println((char)a); // h 출력
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
