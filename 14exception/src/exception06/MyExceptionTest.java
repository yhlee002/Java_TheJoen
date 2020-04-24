package exception06;

public class MyExceptionTest {
	public static void main(String[] args) {
		//사용자 정의 예외도 일반 예외와 같다.
		try {
			throw new MyException();			
		}catch(MyException e) {
			System.out.println(e);
		}
	}
}
