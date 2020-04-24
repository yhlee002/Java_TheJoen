package wrapperEx01;

public class MyWrapperTest {
	public static void main(String[] args) {
		//기본자료형을 객체로 포장해주는 역할
		Integer num = new Integer(10);
		int num01 = 10;
		System.out.println(num);
		System.out.println(num01);
		
		Integer num02 = 100; //auto-boxing
		int num03 = num02; //un-boxing
	}
}
