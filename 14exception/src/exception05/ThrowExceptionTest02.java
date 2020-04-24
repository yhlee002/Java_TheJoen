package exception05;

import java.io.IOException;

public class ThrowExceptionTest02 {
	public static void main(String[] args) {
		//반드시 처리해야 하는 예외. ->컴파일 전 빨간줄 나옴!
		try {
			throw new IOException();			
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("The end!");
	}
}
