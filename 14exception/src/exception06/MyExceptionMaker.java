package exception06;

public class MyExceptionMaker {
	
	//숫자를 문자열로 변경해서 반환하는 메소드 
	public String makeStr(int num) throws MyException {
		String rs = "";
		
		//숫자가 음수로 들어오면 예외를 발생시키게 할 수 있음.
		if(num < 0) {
			throw new MyException();
		}
		
		return rs+num;
	}
}
