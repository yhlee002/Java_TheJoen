package inheritance05;

public class Person { 
	/*
	 * has-a 관계 : 'Person이 Phone을 가지는 것.'
	 * cf.is-a관계 : Person extends Phone일 경우 '사람이 폰이 되는 것'
	 */

	String name;
	Phone myPhone; 
	/* 다형성이 없다면 여러 형태의 객체 종류를 모두 속성으로 가져야 함(상속으로 인한 다형성때문에 가능)
	 * IPhone iphone
	 * GalaxyPhone galaxyphone
	 * NokiaPhone nokiaphone
	 */
	
	public void buyPhone(Phone myPhone) {
		this.myPhone = myPhone;
	}
	
	public void order() {
		System.out.println("주문을 하자!");
		myPhone.call(); //상속을 하지 않고 속성을 가지고 있어도 사용 가능
		
		/*
		 * 상속을 하는 것이 아닌 속성으로 가지는 것으로
		 * Person은 IPhone기능을 사용해야하긴 하지만 IPhone이 되어서는 안된다.
		 * 
		 * Person이 IPhone이 아닌 GalaxyPhone을 갖도록 하려면 추가해야 하는 상황이 생긴다.
		 * 이를 위해 애초에 핸드폰들의 최상위 객체인 Phone을 만들어 상속하도록 하게 하고 사람은 Phone을 속성으로 지니면 된다.
		 * 
		 */
	}
}
