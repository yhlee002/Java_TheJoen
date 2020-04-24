package thread03;

public class Race {
	public static void main(String[] args) {
		Thread[] t = new Thread[5];
		t[0] = new Thread(new Horse("도희"));
		t[1] = new Thread(new Horse("영민"));
		t[2] = new Thread(new Horse("민철"));
		t[3] = new Thread(new Horse("현용"));
		t[4] = new Thread(new Horse("한이"));
		
		for(int i = 0; i < t.length; i++) {
			t[i].start();
		}
	}
}
