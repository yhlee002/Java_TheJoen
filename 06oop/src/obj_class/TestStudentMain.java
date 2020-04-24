package obj_class;

public class TestStudentMain {
	public static void main(String[] args) {
		TestStudent tst1 = new TestStudent();
		tst1.name = "young";
		tst1.kor = 80;
		tst1.math = 70;
		tst1.eng = 100;
		
		System.out.println(tst1.name +" sum : "+ tst1.sum());
		System.out.println(tst1.name +" avg : "+ tst1.avg2());
		
		TestStudent tst2 = new TestStudent();
		tst2.name = "hyun";
		tst2.kor = 50;
		tst2.math = 30;
		tst2.eng = 100;
		
		System.out.println(tst2.name +" sum : "+ tst2.sum());
		System.out.println(tst2.name +" avg : "+ tst2.avg2());
	}
}
