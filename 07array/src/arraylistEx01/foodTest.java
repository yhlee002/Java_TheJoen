package arraylistEx01;

import java.util.ArrayList;

class Food {
	String name;
	int price;
	String[] material;
	
}

class Dessert extends Food{
	String name;
	int price;
	String[] material;
	
	Dessert(String name, int price, String[] material){
		this.name = name;
		this.price = price;
		this.material = material;
	}
}

class Noodle extends Food{
	String name;
	int price;
	String[] material;
	
	Noodle(String name, int price, String[] material){
		this.name = name;
		this.price = price;
		this.material = material;
	}
}

public class foodTest {
	public static void main(String[] args) {
		ArrayList<Food> fd = new ArrayList<Food>();
		fd.add(new Dessert("마카롱", 3000, new String[] {"머랭", "밀가루", "아몬드파우더", "설탕"}));
		fd.add(new Dessert("케이크", 28000, new String[] {"계란", "밀가루", "생크림", "설탕", "과일"}));
		fd.add(new Noodle("우동", 8000, new String[] {"우동사리", "가쓰오부시", "새우튀김", "어묵"}));
		fd.add(new Noodle("라면", 3000, new String[] {"라면사리", "라면스프", "치즈"}));
		
//		ArrayList<Dessert> des = new ArrayList<Dessert>();
//		des.add(new Dessert("마카롱", 3000, new String[] {"머랭", "밀가루", "아몬드파우더", "설탕"}));
//		des.add(new Dessert("케이크", 28000, new String[] {"계란", "밀가루", "생크림", "설탕", "과일"}));
//		
//		ArrayList<Noodle> noo = new ArrayList<Noodle>();
//		noo.add(new Noodle("우동", 8000, new String[] {"우동사리", "가쓰오부시", "새우튀김", "어묵"}));
//		noo.add(new Noodle("라면", 3000, new String[] {"라면사리", "라면스프", "치즈"}));

	}
	
	
}
