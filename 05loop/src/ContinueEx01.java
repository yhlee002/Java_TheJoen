
public class ContinueEx01 {
	public static void main(String[] args) {
		/*
		 * Continue : 해당 반복문의 조건식으로 바로 이동 - 아래에 실행될 코드를 한번 건너뛰는 것(반복문에서 사용)(cf. break)
		 */
		for(int i = 1; i < 11; i++) {
			System.out.println(i);
			if(i % 2 == 1) {
				continue;
			}
			System.out.println("continue 밑!"); // i가 5일때에는 실행되지 않고 넘어감
		}
	}
}
