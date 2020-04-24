
public class DoWhileEx2 {
	public static void main(String[] args) {
		/* do-while문
		 * 무조건 한번 실행 후 검사(참이면 다시 실행하는 것을 반복.)
		 */
		int num = 5;
		while(num >= 0 && num < 5) {
			System.out.print(num+" ");
			num--;
		}
		System.out.println("-------------------------");
		
		num = 5;
		do { //num의 값이 5일때 일단 한번 실행
			System.out.print(num+" ");
			num--; // num 의 값은 4, 3, 2, 1, 0이 됨
		}while(num >= 0 && num < 5);
	}
}
