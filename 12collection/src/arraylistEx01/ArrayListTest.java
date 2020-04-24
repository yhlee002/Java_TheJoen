package arraylistEx01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("감자");
		arraylist.add("고구마");
		System.out.println(arraylist.size());
		
		arraylist.add(1, "무");
		System.out.println(arraylist); //넣고자하는 인덱스도 입력 가능
		System.out.println(arraylist.remove(0)); //인덱스로 지우면 객체가 반환됨
		System.out.println(arraylist.remove("무")); //객체로 지우면 객체가 원래 있던 객체면 true, 없는 객체면 false
		//ex) ln14에서 감자인 인덱스 '0'을 지웠기 때문에 ln15에서 "감자"를 지우려하면 false가 나옴
		
		//ArrayList : 배열에 없는 '가변'이 가능한 것이 특징
		/*
		 * ArrayList : 생성될때 기본적으로 10개의 Object타입 데이터를 담을 수 있는 배열을 생성한다.
		 * 그 양을 초과될 때는 보다 크게 배열을 생성하는 것.(줄어들면 다시 작게 만듦)
		 * 결국, ArrayList는 배열을 구현해주는 것.
		 */
		
		List<String> myList = new ArrayList<String>(); //List가 ArrayList의 상위 클래스이기 때문에 가능.
	}
}
