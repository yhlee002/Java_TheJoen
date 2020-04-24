package condition;
import java.util.Scanner;
public class IfEx01Test {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 숫자를 입력받아서 90~100이면 A학점입니다. 출력
		 * 80~89이면 B학점입니다. 출력
		 * 70~79이면 C학점입니다 출력
		 * 60~69이면 D학점입니다. 출력
		 * 그 이하는 "공부 좀 하자" 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
		int score = sc.nextInt();
//		if(a>100 || a<0) {
//			System.out.println("잘못된 입력입니다.");
//		}else 
		if(score>=90 && score<=100) {
			System.out.println("A학점입니다.");
		}else if(score>=80) { // = 'score >=80 && score<=89'(먼저 작성된 코드때문에)
			System.out.println("B학점입니다.");
		}else if(score>=70) {
			System.out.println("C학점입니다.");
		}else if(score>=60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("공부 좀 하자");
		}
		sc.close();
	}
}
