package inheritance;

import java.util.Arrays;

public class MyTest {
	public static void main(String[] args) {
		//이름, 번호, 취미
		MyParentClass mpc = new MyParentClass(10, "아이언맨", new String[3]);
		System.out.println(mpc.getNumber());
		System.out.println(mpc.getName());
		System.out.println(Arrays.toString(mpc.getHobby()));
		
		String[] h = mpc.getHobby(); //String[] h = mpc.hobby;와 같으나 hobby는 private 멤버 변수
		h[0] = "게임";
		h[1] = "운동";
		h[2] = "영화";
		System.out.println(Arrays.toString(mpc.getHobby()));

	}
}
