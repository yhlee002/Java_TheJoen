package array02_Test01;
import java.util.Scanner;
public class SubjectTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명을 입력하시겠습니까?");
		int stNum = sc.nextInt();
		
		Student[] stNumArr = new Student[stNum];
		Subject[] stSubject = new Subject[3];
		
		int sum = 0;
		int avg = 0;
		for(int j = 0; j < stNum; j++) {
			System.out.println("이름을 입력하시오.");
			String sName = sc.next();
			System.out.println("나이를 입력하시오.");
			int sAge = sc.nextInt();
			stNumArr[j] = new Student(sName, sAge);
			
			for(int i = 0; i < stSubject.length; i++) {
				System.out.println("과목이름을 입력하시오.");
				String sbName = sc.next(); 
				System.out.println("성적을 입력하시오.");
				int sbScore = sc.nextInt();
				
				sum += sbScore;
				stSubject[i] = new Subject(sbName, sbScore);
			}
			stNumArr[j].sSub = stSubject;
			stNumArr[j].printInfo();
			
			avg = sum/stSubject.length;
			System.out.println("[ Sum : "+sum+", Avg : "+avg+" ]");
		}
		sc.close();
	}
}
