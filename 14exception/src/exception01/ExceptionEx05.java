package exception01;

public class ExceptionEx05 {
	public static void main(String[] args) {
		/*특정 예외들은 컴파일 체크를 하는 애들도 있다.
		 * ClassCastException : 자료형간의 묵시적 형변환이 불가할때(Object타입의 데이터를 String형에 담으려고 할때 (다운캐스팅이 필요할때))
		 * 
		 * RuntimeException : 코드를 통해 해결 가능
		 * - ClassCast : 자료형의 변환이 불가할 때
		 * - ArrayIndexOutOfBounds : 배열의 인덱스를 벗어나 사용하려고 할 때
		 * - NullPointer : Null값이 들어가있는 변수를 사용하려고 할 때
		 * 
		 * IOException : 누군가[사람, 파일]에게 입력 또는 출력을 할 때 발생하는 예외(컴파일 체크를 함 - 예외처리를 강제로 위임함)
		 */
		Object obj = new String("자식객체");
		String str = (String) obj;
		System.out.println(str);
		
		//애초에 부모 객체로 만들어졌다면 자식 변수에 못넣음. (타입이 맞지 않는 객체를 변수에 담으려 할 때 발생)
		Object obj2 = new Object();
		String str2 = (String) obj2; //ClassCastException 발생
		
		String str3 = null;
		str3.charAt(0); //NullPointerException 발생
		
	}
}
