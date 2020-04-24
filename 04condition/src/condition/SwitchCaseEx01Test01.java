package condition;
import java.util.Scanner;

public class SwitchCaseEx01Test01 {
	public static void main(String[] args) {
		//사용자로부터 0~100까지의 수를 입력받아 90이상 A, 80이상 B, 70이상 C, 60이상 D
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
		int number = sc.nextInt() /10;
		
//		if(number > 0 && number < 100) {
//			if(number > 90) {
//				number = 1;
//			}else if(number > 80) {
//				number = 2;
//			}else if(number > 70) {
//				number = 3;
//			}else if(number > 60) {
//				number = 4;
//			}
//		}else {
//			System.out.println("잘못 입력하였습니다.");
//		}
		
		

//		switch(number) {
//		case 1 :
//			System.out.println("A");
//			break;
//		case 2 : 
//			System.out.println("B");
//			break;
//		case 3 :
//			System.out.println("C");
//			break;
//		case 4 :
//			System.out.println("D");
//			break;
//		}
		
		switch(number) {
		case 10 : case 9 : 
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		default : //위 케이스에 해당되는 값이 없다면 실행
			System.out.println("F");
			break; //없어도 상관 없음
		}
		sc.close();
	}
}
