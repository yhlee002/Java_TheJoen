package exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx03 {
	public static void main(String[] args) {
		/*
		 * try with resource
		 * - try catch finally문에서는 리소스를 정리해주는 코드가 지저분해지기 때문에 대신 사용
		 * - close()를 내장하고 있는(인터페이스 AutoCloseable를 구현한) 클래스들만 가능
		 * - try()의 괄호 안에 객체를 생성하면 try문이 종료되고 괄호안에서 생성된 객체를 자동으로 close()해줌
		 *
		 *---------------------------------------------------------------------------------------------------
		 * 	cf.try(B b = new B(new A())와 같이 새로운 객체를 만듦과 동시에 인자로 받아 객체를 생성할때
		 * 	내부의 객체(A의 객체)는 close되지 않음. 이를 방지하기 위해선 다음과 같이 작성해야함
		 * 	-> try(A a = new A(); B b = new B(a);
		 * --------------------------------------------------------------------------------------------------
		 * [Syntax]
		 * 		try(자동으로 닫아야 하는 리소스 객체){
		 * 			
		 *		}catch() {
		 *	 		
		 *		}
		 */
		
		try(FileInputStream fis = new FileInputStream("test")){
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
