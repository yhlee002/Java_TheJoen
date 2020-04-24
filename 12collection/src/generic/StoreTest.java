package generic;

public class StoreTest {
	public static void main(String[] args) {
		String str1 = "1번 자료";
		int num1 = 100;
		Store store = new Store();
		store.set(str1);
		String s = (String) store.get();
		
		store.set(num1);//autoboxing(자동으로 int가 아닌 Integer타입으로 들어감)
		int n = (Integer) store.get(); //자동으로 unboxing
		
		store.set("hello");
		
		int hello = (Integer) store.get(); //int형으로 들어올 수 없는 자료형이 담겨있는 경우도 있을 수 있다.
		
		//데이터 타입을 강제할 수 있게 하는 것이 Generic
	}
}
