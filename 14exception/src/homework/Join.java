package homework;

public class Join {
	
	public boolean input(String name, String pwd, String address) throws NoIdException, NoPwdException, NoAddressException {
		boolean rs = true;
		
		if(name == null || name.equals("")) {
			throw new NoIdException("※ 아이디가 입력되지 않았습니다. ※\n");
		}
		if(pwd == null || pwd.equals("")) {
			throw new NoPwdException("※ 비밀번호가 입력되지 않았습니다. ※\n");
		}
		if(address == null || address.equals("")) {
			throw new NoAddressException("※ 주소가 입력되지 않았습니다. ※\n");
		}
		
		return rs;
	}
}
