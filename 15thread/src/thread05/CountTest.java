package thread05;

public class CountTest {
	public static void main(String[] args) {
		Thread c = new Thread(new MyCount());
		c.start();
	}
}
