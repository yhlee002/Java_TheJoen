package test2_Exception;

import java.util.HashSet;
import java.util.Set;

public class MemberDao {
	Set<String> idSet;
	
	public MemberDao() {
		idSet = new HashSet<String>();
	}
	
	public void InputId(String id) throws DuplicateIdException {
		if(!idSet.add(id)) {
			throw new DuplicateIdException();
	
		}else {
			idSet.add(id);
			System.out.println("DB에 "+id+"를 저장했습니다.");
			System.out.println(idSet);
		}
		
	}
}
