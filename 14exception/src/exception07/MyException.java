package exception07;

public class MyException extends Exception{
	//생성지 message도 넣을 수 있는 생성자를 구현
	public MyException(String msg) {
		super(msg);
	}
}
