package array02;

public class Student {
	//이름, 나이, 성적
	String name;
	int age;
	int score;
	//과목 세개를 담는 배열(국어, 수학, 영어)
	Subject[] subjectArr;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		subjectArr = new Subject[3];
	}
	
	public void printInfo() {
		System.out.println("이름 : "+name+" 나이 : "+age+"살");
		System.out.println(subjectArr[0].name+" : "+subjectArr[0].score+"점");
		System.out.println(subjectArr[1].name+" : "+subjectArr[1].score+"점");
		System.out.println(subjectArr[2].name+" : "+subjectArr[2].score+"점");
		System.out.println("평균 : "+((subjectArr[0].score+subjectArr[1].score+subjectArr[2].score)/subjectArr.length));
	}
}

