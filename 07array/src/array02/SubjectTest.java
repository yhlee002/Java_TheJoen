package array02;

public class SubjectTest {
	public static void main(String[] args) {
		//학생1
		Student stu1 =new Student("손한이", 31);
		Subject kor1 = new Subject("국어", 100);
		Subject math1 = new Subject("수학", 100);
		Subject eng1 = new Subject("영어", 100);
		
		Subject[] subArr1 = new Subject[3];
		subArr1[0] = kor1; 
		subArr1[1] = math1;
		subArr1[2] = eng1;
		
		stu1.subjectArr = subArr1;
		stu1.printInfo();
		
		//평균 구하는 코드(이미 다르게 존재)
//		Subject[] sArr = stu1.subjectArr;
//		int sum = 0;
//		for(int i = 0; i < sArr.length; i++) {
//			sum += sArr[i].score;
//		}
//		int avg = sum/sArr.length;
//		System.out.println(avg);
		
		
		//학생2
		Student stu2 =new Student("손한결", 33);
		Subject kor2 = new Subject("국어", 70);
		Subject math2 = new Subject("수학", 80);
		Subject eng2 = new Subject("영어", 90);

		Subject[] subArr2 = new Subject[3];
		subArr2[0] = kor2;
		subArr2[1] = math2;
		subArr2[2] = eng2;
		
		stu2.subjectArr = subArr2;
		stu2.printInfo();
		
		
		//학생3
		Student stu3 =new Student("뚝이", 4);
		Subject kor3 = new Subject("국어", 50);
		Subject math3 = new Subject("수학", 70);
		Subject eng3 = new Subject("영어", 100);
		
		Subject[] subArr3 = new Subject[3];
		subArr3[0] = kor3;
		subArr3[1] = math3;
		subArr3[2] = eng3;
		
		stu3.subjectArr = subArr3;
		stu3.printInfo();
	}
}