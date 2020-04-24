package TestCustomer;

public class VIP extends Customer {
	private double saleRatio;
	private int agentID;
	
	public VIP() {
		this.bonusPRatio = 0.05; 
		this.saleRatio = 0.1;
		this.level = "VIP";
	}
	
	public int getPrice(int price) { //VIP가 아닌 등급들은 모두 가격 그대로기 때문에 별도의 메소드 생성X
		return price - (int) (price*saleRatio);
	}
	
	public void setAgent(int agentID) {
		this.agentID = agentID;
		
	}
	
	public int getAgent() {
		return agentID;
	}
	
}
