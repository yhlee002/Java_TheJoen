package generic01;

public class StoreGenericArray<T> {
	private T[] array;
	
	public StoreGenericArray() {
		array = (T[]) new Object[3]; //자료형을 명시하지 않았기 때문에 Object로 만들어줘야함
	}
	
}
