package exception03;

public class ReaderTest {
	public static void main(String[] args) {
		MyReader reader = new MyReader();
		System.out.println("문자를 입력하세요.");
		String str = reader.readString();
		System.out.println(str);
	}
}
