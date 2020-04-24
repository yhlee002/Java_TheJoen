package setEx01;

import java.util.HashSet;
import java.util.Iterator;

public class setTest {
	public static void main(String[] args) {
		/*
		 * Set
		 * - 중복이 허용되지 않는다.
		 * - 아이디, 주민번호, 사번 등등 유일한 값을 관리할때 사용된다.
		 * - 기본적으로 순서가 없다.
		 * - get() 메소드가 없다. 따라서 하나를 선택해서 꺼낼 수 없다.(꺼내려면 전체를 꺼내야 한다.)
		 */
		HashSet<String> set = new HashSet<String>();
		set.add("우유");
		set.add("빵");
		set.add("버터");
		set.add("치즈");
		set.add("햄");
		
		//전체를 꺼내는 방법 이용(Iterator 사용)
		Iterator<String> set2 = set.iterator();
//		System.out.println(set2.next());
//		System.out.println(set2.hasNext());
//		System.out.println(set2.next());
//		System.out.println(set2.hasNext());
//		System.out.println(set2.next());
//		System.out.println(set2.hasNext());
//		System.out.println(set2.next());
//		System.out.println(set2.hasNext());
//		System.out.println(set2.next());
//		System.out.println(set2.hasNext()); //여기서 더 가져오려고 하면 Exception 발생

		/*
		 * Iterator : Collection 내의 내용을 하나씩 접근하는 객체
		 * hasNext() : 다음에 가져올 내용이 있는지 확인하는 메소드(가져올 내용이 있을 경우 true를 리턴하는 boolean리턴 메소드)
		 * next() : 다음 객체를 반환하는 메소드
		 */
		do{
			System.out.println(set2.next());
		}while(set2.hasNext());
		
//		while(set2.hasNext()) {
//			System.out.println(set2.next());
//		}
		
		
	}
}
