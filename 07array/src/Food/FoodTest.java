package Food;

public class FoodTest {
	public static void main(String[] args) {
		Food rice1 = new Rice("bibimbob", 7000);
		Food noodle1 = new Noodle("pasta", 10000);
		
		Person person1 = new Person("younghyun");
		
		person1.eatFood(rice1);
		person1.eatFood(noodle1);

		person1.printEnergy();
	}

}
