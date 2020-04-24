package exception07;

//회원가입을 받기 위한 클래스
public class JoinMember {
	public boolean join(String id, String pwd) throws MyException {
		boolean result = true;
		if(id == null || id.equals("")) {
			throw new MyException("※ No ID ※");
		}
		//ID가 없으면 예외를 던져주고, main에서 예외가 발생했을 경우 다르게 처리 가능
		if(pwd == null || pwd.equals("")) {
			throw new MyException("※ No Password ※");
		}
		
		return result;
	}
}
