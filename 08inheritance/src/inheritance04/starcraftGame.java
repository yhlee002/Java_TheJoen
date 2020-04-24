package inheritance04;

import java.util.ArrayList;

public class starcraftGame {
	public static void main(String[] agrs) {
		Firebat f1 = new Firebat();
		Firebat f2 = new Firebat();
		
		Medic m1 = new Medic();
		Unit m2 = new Medic(); //다형성(하나의 요소를 여러가지 방식으로 표현 가능)
		
		System.out.println(f1.energy);
		System.out.println(m1.energy);
		//자식객체를 생성할때 부모객체도 같이 생성된다.
		
		System.out.println("파이어뱃 f1 id : "+f1.id);
		System.out.println("파이어뱃 f2 id : "+f2.id);
		System.out.println("메딕 m1의 id : "+m1.id);
	
		f1.attack();
		m1.attack();
		/*
		 * 매개변수를 넣은 생성자를 지닌 부모 클래스를 상속하면서 매개변수를 받기 싫으면 
		 * 자신의 생성자 안에 super을 통해 super의 매개변수에 직접 값을 넣어줘야 함
		 * 혹은 부모 클래스에서 매개변수를 받지 않는 생성자를 하나 더 만들어줌으로써 해결 가능
		 * 
		 * 
		 * 상속은 is-a관계이다.(재사용성도 있지만 is-a관계)
		 * 
		 * 
		 * 다형성(Polymotphism)
		 * 하나의 코드가 여러 가지 자료형으로 구현되어 실행되는 것.
		 */
		
		//부모클래스로 묶어버리면 부모 클래스에 있는 메소드만 사용할 수 있음.
		//(Unit클래스에 정의되지 않은 자식에게만 있는 클래스는 사용 불가능)
		//따라서 Firebat의 steampack을 쓰려면 firebat타입의 변수로 담아서 또는 변경해서 써야한다.
		Unit[] units = new Unit[5]; //이 배열 속의 내용은 업 캐스팅(UpCasting)
		units[0] = new Firebat(); //묵시적 형변환이 일어나는 것 사실 new Firebat()앞에는 묵시적으로 (Unit)이 존재.
		units[1] = new Firebat();
		units[2] = new Firebat();
		units[3] = new Medic();
		units[4] = new Medic();
		
		for(int i=0; i<units.length; i++) {
			units[i].attack();
		}
		
		//자식타입으로 변경
		Firebat firebatFromUnit = (Firebat) units[1]; //다운 캐스팅(DownCasting; 부모 변수 -> 자식 변수)
		firebatFromUnit.steampack();
		
				
		ArrayList<Unit> unitsAl = new ArrayList<Unit>();
		unitsAl.add(new Firebat());
		unitsAl.add(new Firebat());
		unitsAl.add(new Firebat());
		unitsAl.add(new Medic());
		unitsAl.add(new Medic());
		
		
		
		
		
	}
}
