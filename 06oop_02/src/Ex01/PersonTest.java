package Ex01;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "younghyun";
		p1.age = 26;
		p1.tall = 160;
		
		System.out.println(p1.getInfo());
		
		p1.ageUp();
		p1.tallUp();
		
		System.out.println(p1.getInfo());
	}
}
