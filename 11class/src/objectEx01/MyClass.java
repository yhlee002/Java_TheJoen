package objectEx01;

public class MyClass {
	String name;
	
	//객체를 println(객체)를 할 때  자동으로 toString()메소드를 호출하기 때문에, toString()를 오버라이드 한다면 print(객체)를 할 때 속성이 출력되도록 할 수 있다.
	
	public String toString() {
		return "["+name+"]";
	}
}
