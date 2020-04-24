package array02_Test01;

public class Student {
	String sName;
	int sAge;
	Subject[] sSub;
	Student(String sName, int sAge){
		this.sName = sName;
		this.sAge = sAge;
		sSub = new Subject[3]; //세개의 과목을 담는 과목 배열 생성
	}
	
	void printInfo() {
		System.out.println("Name : "+sName+", Age : "+sAge);
		System.out.print("[ ");
		for(int i = 0; i < sSub.length; i++) {
			System.out.print(sSub[i].sbName+" = "+sSub[i].sbScore+" ");
		}
		System.out.println("]");
	}
	
}
