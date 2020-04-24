package obj_class;

public class NewStudentTest {
	public static void main(String[] args) {
		NewStudent s1 = new NewStudent();
		NewStudent s2 = new NewStudent();
		
		s1.name = "알리스타";
		s1.kor = 0;
		s1.math = 0;
		s1.eng = 5;
		
		s2.name = "하이머딩거";
		s2.kor = 100;
		s2.math = 100;
		s2.eng = 100;
		
		//알리스타의 평균은?
		System.out.println("평균 : "+(s1.kor + s1.math + s1.eng)/3);
		//하이머딩거의 평균은?
		System.out.println("평균 : "+(s2.kor + s2.math + s2.eng)/3);
		System.out.println("-----------");
		
		//위의 평균을 구하는 코드는 아래로 사용 가능
		s1.avg();
		s2.avg();
		
		//이름과 각 [과목명 : 점수] 형태로 출력해주는 메소드 만들기.
		s1.print();
		System.out.println("-----------");
		s2.print();
		
		//실제 필요한 타입으로 반환하게 할 수 있음 cf. void는 값을 반환하지 않음(return 사용 불가능)
		//ex) double num = Math.random();
		
		//합을 계산해서 반환하는 메소드 호출
		System.out.println("s1의 합 : "+s1.sum());
	}
}
