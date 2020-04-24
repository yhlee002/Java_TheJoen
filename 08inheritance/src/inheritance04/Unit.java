package inheritance04;

public class Unit {
	static int snum; //시리얼 넘버
	int id; 
	String name;
	int energy;
	
	public Unit(String name) { //상위 클래스의 생성자를 오버라이딩
		id = snum++; //유닛이 생성될때 마다 snum 증가
		System.out.println(name+"이 생성되었습니다.");
		energy = 100;
		this.name = name;
	}
	
	public void attack() {
		System.out.println(name+"이(가) 공격을 합니다.");
	}
}
