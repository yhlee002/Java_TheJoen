package Test;

public class MyCalculTest {
	public static void main(String[] args) {
		MyCalcul ca = new MyCalcul();
		
		ca.num=5;
		System.out.println(ca.add(100));
		System.out.println(ca.mul(2));
		System.out.println(ca.div(0));
		System.out.println(ca.sub(10));
	}
}