package MyPackage;

public class Student {
	//속성 : 이름, 나이
	public String name;
	public int age;

	//이름을 매개변수로 받는 생성자
	Student(String name){
		this.name = name;
	}
	//나이를 매개변수로 받는 생성자
	Student(int age){
		this.age = age;
	}
	//아무것도 받지 않는 생성자
	public Student(){}
	//이름, 나이를 매개변수로 받는 생성자
	Student(String name, int age){
		this.name = name;
		this.age = age;
		//this : 자신의 메모리(객체)를 기리킴(자신의 주소를 반환)
	}
	
	//메소드 이름, 나이를 출력하는 메소드
	public void printInfo() {
		System.out.println(name +", "+age);
	}
	//"이름 : OOO, 나이 : OO" 를 문자열로 반환하는 메소드
	public String getInfo() {
		return "이름 : "+name+", 나이 : "+Integer.toString(age);
	}
}
