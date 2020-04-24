package obj;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	int avg;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		avg = (kor + eng + math) /3;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void printInfo() {
		System.out.println(name+"학생의 국어 성적은 "+getKor()+"점, 영어 점수는 "+getEng()+"점, 수학 성적은 "+getMath()+"점입니다.");
	}
	
	public double getAvg() {
		return avg;
	}
	
	public double SdDeviation() { //Standard Deviation(표준 편차)
		double K = kor - getAvg();
		double E = eng - getAvg();
		double M = math - getAvg();
		
		//(값 - 평균)^ + (값 - 평균)^ + (값 - 평균)^ /과목수(3)
		//Math.pow(제곱할 수, 제곱할 정도) ex) Math.pow(K, 2);
		//분산(dispersion)
		double dispersion = (Math.pow(kor, 2)+Math.pow(eng, 2)+Math.pow(math, 2))/3.0; 
		
		return Math.sqrt(dispersion);
		
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("루피", 10, 10, 10); //평균 : 10
		Student s2 = new Student("조로", 100, 10, 10); //평균 : 40
		s1.printInfo();
		s2.printInfo();
		
		//루피의 평균과 조로의 평균을 구하고, 두 사람의 국어 평균, 영어 평균, 수학 평균을 구하라
		s1.getAvg();
		s2.getAvg();
		
		System.out.println("두 사람의 국어 평균 : "+(s1.kor+s2.kor)/2);
		System.out.println("두 사람의 영어 평균 : "+(s1.eng+s2.eng)/2);
		System.out.println("두 사람의 수학 평균 : "+(s1.math+s2.math)/2);
		//표준편차 : 15
		
		Student s3 = new Student("쵸파", 100, 100, 100);
		
		Student[] stArr = new Student[3];
		stArr[0] = s1;
		stArr[1] = s2;
		stArr[2] = s3;
		
		//국어평균을 구해보자
		double korAvg = 0;
		int korSum = 0;
		for(int i = 0; i < stArr.length; i++) {
			korSum += stArr[i].getKor();
			korAvg = korSum/3.0;
		}
		System.out.println(korAvg);
		
		
		
		
	}
}
