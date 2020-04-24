package exception04;

public class FileInputTest {
	public static void main(String[] args) {
		MyFileInput myfis = new MyFileInput();
		try {
			myfis.readFile();
		} catch (Exception e) {
			e.printStackTrace();
		} //가독성을 위해 FileNotFoundException으로 지정해주는게 좋다.
		System.out.println("끝!");
	}
}
