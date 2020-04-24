package exceptionTest;

import java.util.Random;

public class ThrowDDong {
	int num;
	public int ranNum() {
		Random ran = new Random();
		return num = (ran.nextInt(3)+1);
	}
}
