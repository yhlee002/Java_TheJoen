package io02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {
	public static void main(String[] args) {
		//a~z까지 알파벳을 alpha.txt에 작성
		try(FileOutputStream fo = new FileOutputStream("src/io02/IOtest.txt")) {
			//주소를 안쓰고 파일명만 쓰면 프로젝트 폴더 안에 생김
			
			System.out.println("a~z까지 알파벳을 alpha.txt에 작성");
			
			for(int i = 97; i <= 122; i++) {//97~122
				fo.write(i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//alpha.txt파일을 읽어 대문자로 변경하여 출력하는 코드 작성
		try(FileInputStream fi = new FileInputStream("src/io02/IOtest.txt")) {
			
			byte[] buf = new byte[10];
			int cnt = 0; 
			
			try {
				int ch = 'a' - 'A';//
				while((cnt = fi.read(buf)) != -1) {
					for(int i = 0; i < cnt; i++) {
						System.out.print((char)(buf[i]-ch));
					}
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}
