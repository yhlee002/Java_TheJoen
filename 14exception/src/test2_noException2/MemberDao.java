package test2_noException2;

import java.util.HashSet;
import java.util.Set;

public class MemberDao {
	Set<String> idSet;
	
	public MemberDao() {
		idSet = new HashSet<String>();
	}
	
	public boolean InputId(String id) {
		if(!idSet.add(id)) {
			return false;
		}else {
			idSet.add(id);
			System.out.println("DB에 "+id+"를 저장했습니다.");
			System.out.println(idSet);
			return true;
		}
		
	}
}
