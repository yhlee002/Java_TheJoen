package generic01;

public class Store<T> {
	private Object data;
	public void set(T data) {
		this.data = data;
	}
	
	public Object get() {
		return data;
	}
}
