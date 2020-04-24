package TestStudentSubject;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	ArrayList<Subject> sub;
	int sum;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void sum() {
		sum = 0;
		for(int i= 0; i < sub.size(); i++) {
			sum += sub.get(i).subScore;
		}
		System.out.println("총점 : "+sum);
	}
}
