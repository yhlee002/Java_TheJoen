package array02;

import java.util.Scanner;

public class SubjectTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명의 학생을 입력하시나요?"); 
		int stCount = 0;
		stCount = sc.nextInt();
		Student[] sArr = new Student[stCount];
		Subject[] sbArr = new Subject[3];
		String stName = "";
		int stAge = 0;
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.println("이름을 입력하세요.");
			stName = sc.next();
			System.out.println("나이를 입력하세요.");
			stAge = sc.nextInt();
			for(int j = 0; j < sbArr.length; j++) {
				System.out.println("과목명을 입력하세요.");
				String sbName = sc.next();
				System.out.println("성적을 입력하세요.");
				int sbScore = sc.nextInt();
				
				sbArr[j] = new Subject(sbName, sbScore);
			}
			sArr[i] = new Student(stName, stAge); //Student클래스의 생성자에는 두 인자를 받고 세개의 배열을 생성
			sArr[i].subjectArr = sbArr;
		}
		System.out.println("입력 끝");
		for(Student student : sArr) {
			System.out.print(student.name+", ");
			System.out.print(student.age+" ");
			System.out.print("[");
			for(Subject s : student.subjectArr) {
				System.out.print(s.name+" : "+s.score+" ");
			}
			System.out.println("]");
		}
		sc.close();
	}
}

