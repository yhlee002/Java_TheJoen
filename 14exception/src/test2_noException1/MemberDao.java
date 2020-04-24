package test2_noException1;

import java.util.HashSet;
import java.util.Set;

public class MemberDao {
	Set<String> idSet;
	
	public MemberDao() {
		idSet = new HashSet<String>();
	}
	
	public void InputId(String id) {
		if(!idSet.add(id)) {
			System.out.println("ID가 중복되었습니다.");
			System.out.println("프로그램을 종료합니다.");
		}else {
			idSet.add(id);
			System.out.println("DB에 "+id+"를 저장했습니다.");
			System.out.println(idSet);
		}
		
	}
}
