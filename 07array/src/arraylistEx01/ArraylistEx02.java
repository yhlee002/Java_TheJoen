package arraylistEx01;

import java.util.ArrayList;

public class ArraylistEx02 {
	public static void main(String[] args) {
		ArrayList<String> hobby = new ArrayList<String>();
		//추가
		hobby.add("자전거타기");
		hobby.add("영화감상");
		hobby.add("배드민턴");
		hobby.add("코딩 연습");
		hobby.add("게임");
		
		//출력
//		for(int i=0; i<hobby.size(); i++) {
//			System.out.println(hobby.get(i));
//		}
		System.out.println(hobby);
		
		//삭제
		hobby.remove(3);
		
		ArrayList<String> food = new ArrayList<String>();
		//추가
		food.add("초밥");
		food.add("불고기");
		food.add("부추전");
		food.add("된장찌개");
		food.add("피자");
		
		//삭제
		food.remove(1);
		food.remove(3);
		
		//출력
//		for(String name : food) {
//			System.out.println(name);
//		}
		System.out.println(food);
	}
}
