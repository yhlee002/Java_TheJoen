
public class BreakEx01 {
	public static void main(String[] args) {
		/*
		 * break : 반복문을 벗어나는 키워드(break를 만나면 반복문이 종료된다.
		 */
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println("i는 "+i+" : 하하"); //i가 3이 되기 전까지(0, 1, 2)만 출력된다.
		}
		
		//continue를 이용해서 1~20까지의 수 중 3의 배수를 제외하고 출력하시오.
		for(int i = 1; i <= 20; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.println("i는 "+i);
		}
	}
}
