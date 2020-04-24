package Food; //36.8

public class Person {
	String name;
	int energy;
	Food food;
	
	public Person(String name) {
		this.name = name;
		System.out.println("사람 "+name+" 생성");
		energy = 50;
	}
	public void eatFood(Food food) {
		this.food = food;
//		food.getEnergy();
		System.out.println(food.name+"을(를) 먹는다.");
		energy += 10;
	}
	
	public void printEnergy() {
		System.out.println(energy);
	}
}
