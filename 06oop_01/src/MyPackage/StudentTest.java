package MyPackage;

public class StudentTest {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student(20);
		Student st3 = new Student("non");
		Student st4 = new Student("모르지", 30);

		System.out.println(st1.getInfo());
		System.out.println(st2.getInfo());
		System.out.println(st3.getInfo());
		System.out.println(st4.getInfo());
		
	}
}
