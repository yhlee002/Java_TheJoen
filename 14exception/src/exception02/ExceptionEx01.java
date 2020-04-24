package exception02;
import java.io.*;
public class ExceptionEx01 {
	public static void main(String[] args) {
		/* 컴파일 체크를 하는 예외 (IO예외) : Checked Exception
		 * cf. RuntimeException을 상속받은 Exception의 경우 unchecked Exception으로 예외 처리가 강제되지 않음
		 */
		try {
			System.out.println("예외 발생 코드 위");
			FileInputStream fis = new FileInputStream("test.txt");
			System.out.println("예외 발생 코드 아래"); //예외 발생시 아래의 코드는 실행 X(try문이 종료되고 catch문이 실행됨)
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 못찾았을 때 실행됨.");
		} catch(ArithmeticException e) {
			System.out.println("test");
		}
		System.out.println("끝");
	}
}
