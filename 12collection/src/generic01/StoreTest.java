package generic01;

public class StoreTest {
	//String만 담는 store가 되는 것.
	public static void main(String[] args) {
		Store<String> store = new Store<String>();
		store.set("아이언맨"); //따로 DownCasting해주지 않아도 됨.
//		store.set(22); //다른 타입이 들어갈 가능성도 배제시켜줌.(컴파일 단계에서 미리 체크해줌 -> 런타임 에러 발생 X)
		System.out.println(store.get());
	}
	
}
