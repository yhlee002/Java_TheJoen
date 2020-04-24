
public class NestedLoop {
	public static void main(String[] args) {
		/* 중첩 반복문
		 * 
		 */
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.print("$");
			}
			System.out.println("");
		}
		System.out.println("-----------");
		int i, j;
		for(j = 0; j < 6; j++) {
			for(i = 0; i < j; i++) { //j가 0일때는 실행(출력)X
				System.out.print("♡");
			}
			for(i = 6; i > j; i--) { //int i = 0; i < 5-j; i++
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println("-----------");
		for(i = 0; i < 6; i++) {
			for(j = 5; j >5-i; j--) {
				System.out.print("♡");
			}
			for(j = 0; j < 5-i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
