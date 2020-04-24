package thread03_2;

import thread03.Horse;

public class Race {
	public static void main(String[] args) {
		Thread[] t = new Thread[5];
		t[0] = new Thread(new Horse("A"));
		t[1] = new Thread(new Horse("B"));
		t[2] = new Thread(new Horse("C"));
		t[3] = new Thread(new Horse("D"));
		t[4] = new Thread(new Horse("E"));
		
		for(int i = 0; i < t.length; i++) {
			t[i].start();
		}
		
		
	}
	
}
