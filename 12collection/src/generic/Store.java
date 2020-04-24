package generic;

public class Store {
	//모든 데이터를 담을 수 있는 속성
	private Object data;
	
	//Object 잘형인 객체를 인자로 받아 속성에 저장
	public void set(Object data) {
		this.data = data;
	}
	
	public Object get() {
		return data;
	}
}
