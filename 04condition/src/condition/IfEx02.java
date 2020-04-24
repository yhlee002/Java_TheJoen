package condition;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		/*
		 * 중첩 if문
		 * if문의 바디에는 또 다른 if문이 들어갈 수 있다.
		 * 점심에 라밥을 간다, 안간다? --> 간다면 라면을 먹을거야 덮밥을 먹을거야?
		 */
		
		boolean labob = true;
		String menu = "라면";
		if(labob == true) {
			System.out.println("라밥에 간다.");
			if(menu.equals("라면")) {
				System.out.println("라면 먹는다.");
			}else if(menu.equals("덮밥")){
				System.out.println("덮밥 먹는다.");
			}else {
				System.out.println("다른거 먹는다.");
			}
		}else {
			System.out.println("다른데 간다.");
		}
		
		//가게 이름을 입력받고 메뉴 이름을 입력받아서 해당되는 내용을 중첩 if문으로 출력해보기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가게 이름을 입력하시오.");
		String store = sc.next();

		String menu2;
		
		if(store.equals("뚝배기집")) {
			System.out.println("뚝배기 집을 간다.");
			
			System.out.println("메뉴를 입력하시오.");
			menu2 = sc.next();
			
			if(menu2.equals("된장찌개")) {
				System.out.println("된장찌개를 먹는다.");
			}else {
				System.out.println(menu2+"를 먹는다.");
			}
		}else {
			System.out.println("메뉴를 입력하시오.");
			menu2 = sc.next();
			System.out.println(store+"을(를) 가서 "+menu2+"을(를) 먹는다.");
		} 
		sc.close();
	}
}
