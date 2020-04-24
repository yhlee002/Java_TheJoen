//import java.util.Random;
import java.util.Scanner;
public class ExTest01 {
	public static void main(String[] args) {
		//1~100 수 중 랜덤으로 하나의 숫자를 생성하고, 사용자로부터 숫자를 입력받아 그 수를 맞출때까지 계속 입력받는 프로그램 작성
		int a = (int) (Math.random()*10 + 1); //0~1
		Scanner sc = new Scanner(System.in);
		int b;
		int count = 0;
//		System.out.println("수를 입력하시오.");
//		b = sc.nextInt();
//		while(a != b) {
//			System.out.println("다시 입력하시오.");
//			b = sc.nextInt();
//		}
		
		do {
			System.out.println("수를 입력하시오.");
			b = sc.nextInt();
			if(b > a) {
				System.out.println("보다 작은 값입니다.");
			}else if(b < a){
				System.out.println("보다 큰 값입니다.");
			}
			count++;
		}while(a != b);
		System.out.printf("정답입니다. 시도 횟수는 %d회 입니다.", count);
	}
}
