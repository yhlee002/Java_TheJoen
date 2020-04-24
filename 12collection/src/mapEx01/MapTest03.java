package mapEx01;

import java.util.HashMap;
import java.util.Map;

public class MapTest03 {
	public static void main(String[] args) {
		//키는 주제, 값은 해당되는 값을 넣으시오.
		//취미 :  운동
		//특기 : 공부
		//키 : 180
		//몸무게 : ...
		//등등 map 객체 만들어서 사람의 정보를 넣으시오.
		
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("취미", "게임");
		personMap.put("특기",  "공부");
		personMap.put("키", "180");
		personMap.put("몸무게", "90");
		personMap.put("거주지", "종로구");
		
		System.out.println(personMap);
	}
}
