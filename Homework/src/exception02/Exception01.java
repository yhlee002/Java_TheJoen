package exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception01 {
	public static void main(String[] args) {
		//컴파일 체크를 하는 예외 IOException
		
		try {
			System.out.println("예외 발생하는 코드 위쪽");
			FileInputStream fis = new FileInputStream("test.txt");
			System.out.println("예외 발생하는 코드 아래");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 못찾았을때 실행됨.");
		}catch(ArithmeticException e) {
			System.out.println("test");
		}
		System.out.println("끝");
	}

}
