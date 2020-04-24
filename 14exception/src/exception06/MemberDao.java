package exception06;

import java.util.HashSet;
import java.util.Set;

public class MemberDao { //DAO = 'data access object'의 준말
	
	Set<String> idSet; //ID가 저장되는 공간
	
	public  MemberDao() { 
		idSet = new HashSet<String>();
	}
	public void inputId(String id) throws DuplicateIdException { //DB에 아이디를 추가하는 메소드
		
		if(!idSet.add(id)) {
			throw new DuplicateIdException();
		}
		
		System.out.println("DB에 "+id+"를 저장했습니다.");
	}
}
