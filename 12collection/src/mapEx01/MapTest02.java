package mapEx01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
	public static void main(String[] args) {
		//key 객체가 될 수도 있다.
		Map<String, String> map = new HashMap<String, String>();
		//id와 이름
		map.put("1212", "홍길동");
		map.put("5555", "홍길은");
		map.put("삼삼삼", "홍길금");
		
		
		//keySet(), values()를 통해 키와 값을 Set으로 담을 수 있다.(Collection으로도 가능)
		Set<String> keys = map.keySet(); //키값을 Set객체에 담아 반환
		Collection<String> values = map.values();
		System.out.println(keys);
		System.out.println(values);
	}
}
