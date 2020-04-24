package mapEx01;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		/*
		 * Map
		 * key와 value가 각각 하나씩 짝으로 이루어진다.
		 * 중복이 허용되지 않는다.
		 * 검색에 사용된다.
		 */
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		//Map.put(key, value);
		myMap.put(0, "초밥");
		myMap.put(1, "국밥");
		myMap.put(2, "설렁탕");
		
		//가져올때는 List와 같이 get(key)
		System.out.println(myMap.get(0));
		System.out.println(myMap.get(1));
		System.out.println(myMap.get(2));
		
		for(int i = 0; i < myMap.size(); i++) {
			System.out.println(myMap.get(i));
		}
		myMap.put(5, "피자");
		System.out.println(myMap.get(5));
	}
}
