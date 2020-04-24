package objectEx01;

import java.util.ArrayList;

public class MyClassTest {
	public static void main(String[] args) {
		
		MyClass my = new MyClass();
		my.name = "냠냠";
		System.out.println("my : "+my);
		System.out.println(my.toString());
		System.out.println(my.hashCode());
		
		String str = my.toString(); //toString() : 객체의 주소를 문자열로 변경해주는 메소드
		System.out.println(str);
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		System.out.println(list);
		System.out.println(list.toString()); //ArrayList는 toString을 overriding해서 객체의 주소가 아니라 내용물이 나오게 해줌
		
		String s1 = new String("멜론");
		s1.toString(); //String 역시 overriding을 통해 내용이 출력되도록 해줌
		
		MyClass you = new MyClass();
		//equals는 해시코드를 비교함.
		System.out.println("my.equals(you) : "+my.equals(you)); //주소 비교(원래 형태)
		
		//String 클래스는 equals을 오버라이드 한 상태(해시코드가 아닌 문자열을 비교하도록 오버라이딩)
		String str1 = "Hello";
		String str2 = "It's me";
		String str3 = "Hello";
		String str4 = new String("It's me");
		
		System.out.println("str2 == str4 : "+(str2 == str4)); //주소가 같은지 확인
		System.out.println("str2.equals(str4) : "+str2.equals(str4)); //문자열이 같은지 확인(오버라이딩되어서) - 원래 Object클래스에선 주소가 같은지 확인
		
		
		
	}
	
}
