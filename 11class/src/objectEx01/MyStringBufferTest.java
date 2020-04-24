package objectEx01;

public class MyStringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("안녕하세요.");
		String str = new String("안녕하세요.");
		System.out.println(sb);
		str = str+ "!"; //String에서 문자 "!" 추가, 객체가 새롭게 생성
		sb.append("!"); //StringBuffer에서 문자 "!"추가, 기존 객체를 변경시킴
		
		//숫자 1~10까지의 합을 구하는 코드 작성(1+2+3+..+8+9+10이 출력되도록. StringBuffer를 이용
		StringBuffer sb2 = new StringBuffer();
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			
//			if(i == 10) {
//				sb2.append(i);
//				break;
//			}
			sb2.append((i == 10)? i : i+"+");
			
		}
		sb2.append(" = "+sum);
		System.out.println(sb2.toString());
	}
}
