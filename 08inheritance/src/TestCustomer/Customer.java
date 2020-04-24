package TestCustomer;

public class Customer {
	static int id = 100;
	String name;
	String level; //BRONZE -> SILVER -> GOLD -> VIP
	int bonusP; //사용한 금액*bonusPRatio
	double bonusPRatio; //0.01 -> 0.02 -> 0.03 -> 0.05
	
	public Customer() {
		level = "BRONZE"; 
		bonusPRatio = 0.01;
	}
	
	public void setCustomer(String name) {
		Customer.id++;
		this.name = name;
	}
	
	public int getBonusP(int price) {
		bonusP += (int) (price*bonusPRatio);
		return bonusP;
	}
	
	public void getCustomerInfo() {
		System.out.println(name+"("+id+") 고객님의 회원 등급은 ["+level+"]이며, 현재 보너스 포인트는 ["+bonusP+"점] 입니다.");
	}
	
	
	
}
