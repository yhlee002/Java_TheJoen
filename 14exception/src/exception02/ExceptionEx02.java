package exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx02 {
	public static void main(String[] args) {
		/*
		 * try catch finally
		 * finally는 리소스를 정리해줘야할 때 사용됨(객체 등을 지워줌)
		 * finally블럭은 항상 실행됨
		 */
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("test"); //fis에는 객체 존재X(객체가 변수에 들어가는 과정에서 예외가 발생해 실제로 객체가 들어가진 못함
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일이 없어서 예외를 처리함");
		}finally {
			if(fis != null) {
				try {
					fis.close(); //fis는 null이므로 exception발생.
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
