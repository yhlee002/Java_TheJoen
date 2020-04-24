package inner01;

public class innerClassTest {
	public static void main(String[] args) {
		OutClass out = new OutClass();
//		out.inClass.inTest();
		out.usingClass(); //보안성 향상
	}
}
