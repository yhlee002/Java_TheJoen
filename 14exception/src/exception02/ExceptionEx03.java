package exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx03 {
	public static void main(String[] args) {
		//리소스를 당아주는 내용이 너무 지저분해 resources를 정리해주는 try = with - resources문
		//close() 라는 메소드를 갖고있는 애들만 가능(AutoCloseable 인터페이스를 구현한 클래스(의 객체들)만 가능)
//		FileInputStream fis = new FileInputStream("test");
		try {
			FileInputStream fis = new FileInputStream("test");
		}catch(FileNotFoundException e){//파일이 없을때 발생할 수 있는 예외처리
			System.out.println(e);
		}catch(IOException e1) { //입출력에서 발생할 수 있는 예외 처리
			System.out.println(e1);
		}
		//try문이 종료되면 ( ) 안에 생성한 fis 객체를 자동으로 close()해준다.
	}
}
