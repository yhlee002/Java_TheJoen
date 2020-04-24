package arraylistEx01;

import java.util.ArrayList;

public class ArraylistEx01 {
	public static void main(String[] args) {
		ArrayList<String> foodList = new ArrayList<String>();
		//ArrayList : 배열의 크기를 미리 정할 필요 없음
		foodList.add("돌돔회");
		foodList.add("막창");
		foodList.add("닭발");
		
		System.out.println(foodList.size()); //size() : list의 수를 의미
		System.out.println(foodList.get(0)); //get(index) : 가져올 원소의 인덱스를 입력
		
		System.out.println("--------");
		
		for(int i=0; i<foodList.size(); i++) {
			System.out.println(foodList.get(i));
		}
		
		foodList.remove(2); //remove(index) : 삭제 --> 특정 원소가 삭제되면 그 뒤의 원소들의 인덱스 값이 줄어든다.
		foodList.add(0, "돼지갈비");
		for(String string : foodList) {
			System.out.println(string);
		}
		
		
	}
}
