package Test;

public class Ex01Test {
	public static void main(String[] args) {
		System.out.println(Ex01.sum(3, 5));
		System.out.println(Ex01.sub(10, 100));
		System.out.println(Ex01.mul(-2, 4));
		
		Ex01 ex = new Ex01();
		System.out.println(ex.div(3, 0));
		System.out.println(ex.rem(4, 3));
	}
}