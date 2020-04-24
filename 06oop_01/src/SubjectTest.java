
public class SubjectTest {
	public static void main(String[] args) {
		Subject sbj1 = new Subject();
		sbj1.name = "자바프로그래밍";
//		sbj1.score = -100;
		sbj1.setScore(-100);
		System.out.println(sbj1.getScore());
//		System.out.println(sbj1.name + sbj1.score);
	}
}
