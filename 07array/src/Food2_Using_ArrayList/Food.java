package Food2_Using_ArrayList;

public class Food {
	String type;
	String name;
	int energy = 10; //Person의 energy와 연동 X일듯
	int price;
	public Food(String type) {
		this.type = type;
	}
	public int getEnergy() {
		return energy += 10;
	}
}	
