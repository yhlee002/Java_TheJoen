package io02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTestEx02 {
	public static void main(String[] args) {
		byte[] buf = new byte[10]; //buf를 이용해서 파일 읽기
		
		FileInputStream fi = null;
		int cnt = 0;
		
		try {
			fi = new FileInputStream("src/io02/untitled2.txt");
			try {
				while((cnt = fi.read(buf)) != -1){
					/* 물통에서 물이 빠져나가는 것처럼, 이전 반복문에서 읽은 내용이 누적되지 않음
					 * 그 때 그 때 읽은 부분만 나옴
					 */
					for(int j = 0; j < cnt ; j++) { //10byte씩 읽기 때문에 열자리의 인덱스를 반복문을 이용해 읽어줌
						System.out.print((char)buf[j]); 
					}			
				}			
			} catch (IOException e) {
				e.printStackTrace(); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
		
	}
}
