package exception04;

public class NullPointerTest {
	public static void main(String[] args) {
		String str = null;
		
		try {
			str.charAt(5);			
		} catch(NullPointerException e) { //NullPointerException 경우 예외처리
			System.out.println(e);
		} catch(Exception e) { //NullPointerException이 아닐경우 예외처리 (순서가 바뀌면 오류!)
			e.printStackTrace();
		}
		System.out.println("The end!");
	}
}
