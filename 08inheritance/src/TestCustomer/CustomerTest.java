package TestCustomer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustomer("이영현");
		c1.bonusP = 100;
		c1.getBonusP(5000);
		c1.getCustomerInfo();
		
		VIP c2 = new VIP();
		c2.setCustomer("정혜원");
		c2.bonusP = 2000;
		c2.setAgent(115);
		System.out.println("해당 상품의 가격은 "+c2.getPrice(4000)+"원 입니다.");
		System.out.println("해당 고객님의 담당 상담원 ID는 "+c2.getAgent()+" 입니다.");
		c2.getCustomerInfo();
		
		
	}
}
