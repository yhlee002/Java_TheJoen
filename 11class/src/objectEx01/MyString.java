package objectEx01;

public class MyString {
	public static void main(String[] args) {
		//String 클래스
		//str1, 2, 3은 상수풀(constance pool), str4는 힙 메모리에 생성
		String str1 = "Hello";
		String str2 = "It's me";
		String str3 = "Hello";
		
		//heap 객체를 씀
		String str4 = new String("It's me");
		
		System.out.println("str1 == str3 : "+(str1 == str3)); //true
		System.out.println("str2 == str4 : "+(str2 == str4)); //false - 둘의 주소는 다름(하나는 상수풀, 하나는 힙)
		
		//hashCode()가 오버라이딩되어서 주소는 다르지만 문자열이 같으면 같은 해시코드를 가지게 출력됨.
//		System.out.println("str1.hashCode() : "+str1.hashCode());
//		System.out.println("str2.hashCode() : "+str2.hashCode());
//		System.out.println("str3.hashCode() : "+str3.hashCode());
//		System.out.println("str4.hashCode() : "+str4.hashCode());
		
		str3 = "Hello";
		System.out.println(str3.hashCode());
		
		str3 += 10;
		System.out.println(str1);
		System.out.println(str3); //기존 상수풀의 객체가 수정된것이 아니라 새로운 객체가 만들어진 것.
		
		//String은 불변이다.(immutable)

		
		
	}
}
