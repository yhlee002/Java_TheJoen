package Ex01;

public class Person {
	//일생활에서 할만한 객체 하나 선택.
	//속성 3개 이상
	//메소드 2개
	//속성 값 문자열로 반환하는 메소드
	String name;
	int age;
	int tall;
	
	public int ageUp() {
		return age += 1;
	}
	public int tallUp() {
		return tall += 5;
	}
	public String getInfo() {
		return "name : "+name+", age : "+age+", tall : "+tall;
	}
}
