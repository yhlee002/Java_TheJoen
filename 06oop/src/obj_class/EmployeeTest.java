package obj_class;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e01 = new Employee();
		Employee e02 = new Employee();
		
		e01.name = "이영현";
		e01.age = 26;
		e01.money = 3000000;
		
		e02.name = "홍길동";
		e02.age = 30;
		e02.money = 2500000;
		
		System.out.println(e01.name+"의 나이는 "+e01.age+"세이며, 연봉은 "+e01.money+"이다.");
		System.out.println(e02.name+"의 나이는 "+e02.age+"세이며, 연봉은 "+e02.money+"이다.");
		
		e01 = e02; //두 변수는 같은 인스턴스를 참조하게 됨
		e01.name = "잉영형";
		
		System.out.println(e01.name+"의 나이는 "+e01.age+"세이며, 연봉은 "+e01.money+"이다.");
		System.out.println(e02.name+"의 나이는 "+e02.age+"세이며, 연봉은 "+e02.money+"이다.");
	}
}