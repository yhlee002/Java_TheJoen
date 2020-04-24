package inheritance;

public class MyChildClass extends MyParentClass{ //매개변수가 없는 상위 클래스의 생성자가 없으면 오류 발생
	public MyChildClass(int number, String name, String[] hobby){
		super(number, name, hobby);
	}
	
}

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student extends Person{
	Student(String name, int age){
		super(name, age);
	}
	
}
