package arraylistEx01;

import java.util.LinkedList;

public class LinkedListTest {
	/*
	 *List 하위의 ArrayList와 LinkedList는 같은 메소드를 공유하지만, 둘의 차이는 배열을 사용하느냐 링크를 사용하느냐 하는 것이다.
	 *ArrayList는 인덱스로 접근 가능하지만 LinkedList는 직접적으로 접근할 수 없다.(접근하려는 데이터까지 닿기 위해 거쳐가야하는 데이터들 존재)
	 *하지만 ArrayList는 데이터를 삭제하면 삭제한 데이터의 뒷 데이터들의 인덱스를 하나씩 당겨줘야 하고, 데이터를 중간에 넣기 위해선 뒷 데이터들의 인덱스를 하나씩 밀어줘야해 번거로움.
	 *반면에, LinkedList는 데이터를 삭제해도 링크를 연결하면 되기때문에 수정이 용이
	 *주로 사용하는 곳 ) AL : 조회가 자주 일어나는 곳에 사용 / LL : 삽입, 삭제가 자주 일어나는 곳에 사용
	 */
	
	//Collection method : add(), remove(), size(), isEmpty(), clear() 등
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		linkedlist.add("사과");
		linkedlist.add("바나나");
		linkedlist.add("귤");
		System.out.println(linkedlist);
		System.out.println(linkedlist.remove(0));
//		System.out.println(linkedlist.get(0));
		System.out.println(linkedlist.remove("귤"));
		System.out.println(linkedlist.isEmpty());
	}
}
