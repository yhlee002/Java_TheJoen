package exception07;

import java.util.HashMap;
import java.util.Map;

public class ExDB {
	Map<String, String> map;
	
	public ExDB() {
		map = new HashMap<String, String>();
		map.put("일번",  "루피");
		map.put("이번",  "조로");
		map.put("삼번",  "상디");
		map.put("사번",  "나미");
		map.put("오번",  "쵸파");
		map.put("육번",  "프랑키");
		
	}
}
