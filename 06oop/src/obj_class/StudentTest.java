package obj_class;

public class StudentTest {
	public static void main(String[] args) {
		Student s1; //사용자 정의 자료형
		s1 = new Student();
		s1.name = "홍길동";
		s1.age = 31;
		s1.id = 1;
		
		Student s2;
		s2 = new Student();
		s2.name = "베인";
		s2.age = 21;
		s2.id = 2;
		Student s3;
		s3 = new Student();
		s3.name = "올라프";
		s3.age = 35;
		s3.id = 3;
		
		System.out.println("s1 : "+s1+", s2 : "+s2);
		System.out.println(s1.name+"학생의 나이는 "+s1.age+"세이고, 학번은 "+s1.id+"이다.");
		System.out.println(s2.name+"학생의 나이는 "+s2.age+"세이고, 학번은 "+s2.id+"이다.");
		System.out.println(s3.name+"학생의 나이는 "+s3.age+"세이고, 학번은 "+s3.id+"이다.");
		

	}
	
}
