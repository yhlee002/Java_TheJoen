package test;

public class Student{
	String name;
	Score score;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setScore(int kor, int eng, int math) {
		score.kor = kor;
		score.eng = eng;
		score.math = math;
	}
	
}