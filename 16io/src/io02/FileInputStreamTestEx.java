package io02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTestEx {
	public static void main(String[] args) {
		//반복문 사용해서 파일을 읽고 출력해보기
		FileInputStream fi = null;
		int cnt = 0;

		try {
			fi = new FileInputStream("src/io02/untitled2.txt");
			try {
				while((cnt = fi.read()) != -1) { //while(fi.available() > 0)
					System.out.print((char)cnt);
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(fi != null) {
				try {
					fi.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		


		
		
	}
}
