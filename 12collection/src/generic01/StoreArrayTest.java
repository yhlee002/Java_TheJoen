package generic01;

public class StoreArrayTest {
	public static void main(String[] args) {
		StoreArray sa = new StoreArray();
		Object[] dArr = new Object[3];
		dArr[0] = "Hello";
		dArr[1] = "World";
		dArr[2] = "!!";
//		Object test = new Object();
//		
//		String[] sArr = (String[]) dArr;
//		for(String string : sArr) {
//			System.out.println(string);
//		}
		
		Object[] dArr01 = new String[] {"test1", "test2", "test3"};
		String[] sArr01 = (String[]) dArr01;
		for(String string : sArr01) {
			System.out.print(string+" ");
		}
		
		sa.set(sArr01);
	}
}
