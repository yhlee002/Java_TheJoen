package Food2_Using_ArrayList;
import java.util.ArrayList;

public class FoodTest {
	public static void main(String[] args) {
		ArrayList<Dessert> des = new ArrayList<Dessert>(); //객체를 담는 ArrayList객체
		des.add(new Dessert("macaron", 3000)); //객체(name : macaron, price : 3000) 생성
		des.add(new Dessert("a piece of cake", 8000));
		
		ArrayList<Rice> ric = new ArrayList<Rice>();
		ric.add(new Rice("bibimbob", 8000));
		ric.add(new Rice("bokkeombob", 9000));
		
		ArrayList<Food> foo = new ArrayList<Food>();
		//foo에 ArrayList 객체인 des와 ric 담기 가능?

	}
}

