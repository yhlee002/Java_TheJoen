package io02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		/*
		 * FileOutputStream은 출력할 파일을 연결하여 객체를 생성해주나,
		 * 파일이 없으면 자동으로 파일을 만들어 준다.
		 */
		
		try(FileOutputStream fout = new FileOutputStream("src/io02/out_test.txt")){
			fout.write(97); //file에 아스키코드'97'인 'a'를 작성
			fout.write(1); //작/큰 따옴표를 사용하지 않는 정수나 문자의 경우 아스키 코드 출력됨
			fout.write('1');
			fout.write('B');
			for(int i = 1; i < 128; i++) {
				fout.write(i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
