package inheritance05;

public class MyTest {
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		iphone.call();
		
		GalaxyPhone galaxyphone = new GalaxyPhone();
		galaxyphone.call();
		
		Person p = new Person();
		p.buyPhone(iphone);
		p.buyPhone(galaxyphone); // myPhone속성의 값이 iphone에서 galaxyphone으로 변경
		p.myPhone.call(); //이는 실제로는 Person의 객체인 p가 가지는 속성 중 myPhone에 들어간 galaxyphone객체를 사용하여 call을 하는 것.
		p.order();
		
	}
}
