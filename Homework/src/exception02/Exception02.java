package exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {
	public static void main(String[] args) {
		/*
		 * try-catch-finally
		 * finally : 리소스(생성된 객체들)을 닫아줄때 사용됨
		 * finally구문은 try구문이 실행되면 반드시 실행됨
		 */
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없어서 예외를 처리함");
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
