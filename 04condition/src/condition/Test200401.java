package condition;

import java.util.Scanner;

public class Test200401 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1
		System.out.println("1~5번 중에서 메뉴 번호를 입력하시오.");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("군만두");
			break;
		case 2:
			System.out.println("짜장면");
			break;
		case 3:
			System.out.println("쟁반짜장");
			break;
		case 4:
			System.out.println("짬뽕");
			break;
		case 5:
			System.out.println("탕수육");
			break;
		}
		System.out.println("===================");
		//2
		System.out.println("문자 하나를 입력하시오.");
		int alpha = (sc.next()).charAt(0);
		int change = alpha >= 97 ? alpha - 32 : alpha + 32;
		System.out.println((char)change);
//		char ch = 'a';
//		if(ch < 97) { //97 대신 'a'를 사용해도 된다. -> (ch >= 'A' || ch <= 'Z')으로 하면 매우 정확
//			ch+=32; //int 변수명 = 'a' - 'A' 라는 변수를 초기화해도 32 대신 사용할 수 있다.
//			System.out.println(ch);
//		}else {
//			ch-=32;
//			System.out.println(ch);
//		}
		System.out.println("===================");
		
		//3
		System.out.println("국적를 입력하시오.");
		String country = sc.next();
		
		if(country.equals("Korea")) {
			System.out.println("지역(시)을 입력하시오.");
			String si = sc.next();
			System.out.println("나이를 입력하시오.");
			int age = sc.nextInt();
			
			if(si.equals("Jejusi")||si.equals("Seoguiposi")) {
				System.out.println("요금 : 3,000");
			}else {
				if(age >= 20) {
					System.out.println("요금 : 10,000");
				}else if(age < 20) {
					System.out.println("요금 : 5,000");
				}
			}
		}else {
			System.out.println("요금 : 15,000");
		}
		System.out.println("===================");
		
		//4
		double pay = 9000;
		System.out.println("일한 시간을 입력하시오.");
		int time = sc.nextInt();
		
		if(time > 8) {
			System.out.println("하루 임금 : "+((pay*8) + (time-8)*(1.5*pay)));
		}else {
			System.out.println("하루 임금 : "+pay*time);
		}
		System.out.println("===================");
		
		//5
		System.out.println("소득을 입력하시오.");
		int money = sc.nextInt();
		double duty = 0;
		if(money > 30000 && money <= 50000) {
			duty = money*0.04 - 2540; 
		}else if(money > 15000) {
			duty = money*0.38 - 1940;
		}else if(money > 8800) {
			duty = (money*0.35) - 1490;
		}else if(money > 4600) {
			duty = (money*0.24) - 522;
		}else if(money > 1200) {
			duty = (money*0.15) - 108;
		}else if(money <= 1200) {
			duty = money*0.06;
		}
		System.out.println("소득세 : "+duty+"만원");
		System.out.println("===================");
		
		//6
		System.out.println("사이즈를 입력하시오.");
		int size = sc.nextInt()/100;
		switch(size) {
		case 0 :
			System.out.println("미꾸 스몰");
			break;
		case 1 :
			System.out.println("미꾸 미디움");
			break;
		case 2 :
			System.out.println("미꾸 라지");
			break;
		}
		System.out.println("===================");
		
		//7
		System.out.println("년도를 입력하시오.");
		int year = sc.nextInt();
		System.out.println("월(달)을 입력하시오.");
		int month = sc.nextInt();
		
//		if(year%4 == 0 && year%100 != 0 && year%400 == 0) {
//			System.out.println("해당 년도는 윤년입니다.");
//		}else {
//			System.out.println("해당 년도는 윤년이 아닙니다.");
//		}
		
		int y;
		
		if(year%4 == 0) {
			y = 1;
			if(year%100 ==0) {
				y = 2;
				if(year%400 == 0) {
					y = 1;
				}
			}
		}else {
			y = 2;
		}
		switch(y) {
		case 1 :
			System.out.println("입력하신 년도는 윤년입니다.");
			break;
		case 2 :
			System.out.println("입력하신 년도는 윤년이 아닙니다.");
			break;
		}
		//1, 3, 5, 7, 8, 10, 12 : 31일, 윤년 : 2월이 총 29일
//		if(y == 1) {
//			switch(month) {
//				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//					System.out.println(month+"월은 총 31일입니다.");
//					break;
//				case 4: case 6: case 9: case 11:
//					System.out.println(month+"월은 총 30일 입니다.");
//					break;
//				case 2 : //2월 case에만 if문을 넣음으로써 윤달인 해와 윤달이 아닌 해를 구분할 수 있음.(switch문 안에 if문 가능. 반대는 X)
//					System.out.println(month+"월은 총 29일입니다.");
//					break;
//			}
//		}else if(y == 2) {
//			switch(month) {
//			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//				System.out.println(month+"월은 총 31일입니다.");
//				break;
//			case 4: case 6: case 9: case 11:
//				System.out.println(month+"월은 총 30일 입니다.");
//				break;
//			case 2 : 
//				System.out.println(month+"월은 총 28일입니다.");
//				break;
//			}
//		}
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println(month+"월은 총 31일입니다.");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println(month+"월은 총 30일입니다.");
				break;
			case 2 :
				if(y == 1) {
				System.out.println(month+"월은 총 29일입니다.");
				}else if(y == 2) {
					System.out.println(month+"월은 총 28일입니다.");
				}
		}
		
		sc.close();
		
	}
}


