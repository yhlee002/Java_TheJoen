package array02_Test02;

public class DessertTest {
	public static void main(String[] args) {
		//마카롱
		String name = "마카롱";
		int price = 2000;
		String[] material = new String[3];
		material[0] = "아몬드 파우더";
		material[1] = "밀가루";
		material[2] = "머랭";
		
		Dessert macaron = new Dessert(name, price, material);

		/*
		 * "마카롱"이라는 객체, 아몬드 파우더라는 객체, 밀가루라는 객체, 머랭이라는 객체, 
		 * (아몬드파우더, 밀가루, 머랭을 포함하는)material배열 객체, macaron이라는 객체 모두 heap영역에 존재. 
		 */
		
		System.out.println("macaron.material : "+macaron.material);
		System.out.println("material : "+material);
		//위의 두 객체는 같은 객체로 주소값을 여러 곳에 대입하여 사용할 수 있는 것.
		
		Dessert cake = new Dessert("케이크", 20000, new String[] {"밀가루", "계란", "우유", "생크림", "딸기"});
		
		Dessert[] dArr = new Dessert[2];
		dArr[0] = macaron;
		dArr[1] = cake;
		
		System.out.println(dArr[0].material[0]);
	}
}
