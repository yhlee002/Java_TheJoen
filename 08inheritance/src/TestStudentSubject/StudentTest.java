package TestStudentSubject;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(1001, "Lee");
		Student s2 = new Student(1002, "Kim");
		
		s1.sub = new ArrayList<Subject>();
		s1.sub.add(new Subject("Kor", 100));
		s1.sub.add(new Subject("Math", 50));
		
		s2.sub = new ArrayList<Subject>();
		s2.sub.add(new Subject("Kor", 70));
		s2.sub.add(new Subject("Math", 85));
		s2.sub.add(new Subject("Eng", 100));
		
		System.out.println(s1.sub);
		System.out.println(s2.sub);
		
		System.out.println(s1.sub.get(0).subName);
		
		s1.sum();
		s2.sum();
	}
}
