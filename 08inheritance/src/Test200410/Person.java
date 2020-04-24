package Test200410;

import java.util.Random;

import javax.swing.JOptionPane;

public class Person {
	String id;
	Character character;
	Random ran;
	int damage;
	
	public Person() {
		String id = JOptionPane.showInputDialog("id를 입력하세요.");
		System.out.println("[id 생성 : "+id+"]");
	}
	
	public void setName() {
		this.character.name = JOptionPane.showInputDialog("캐릭터명을 입력하세요.");
	}
	
	public void getId() {
		System.out.println("[캐릭터명이 \""+this.character.getName()+"\"으로 설정되었습니다.]");
	}
	
	public void makeCharacter() {
		
		System.out.println("캐릭터의 직업을 골라주십시오.");
		System.out.println("1.Worrier 2.Mage 3.Archer 4.Assassin");
		int kind = Integer.parseInt(JOptionPane.showInputDialog("캐릭터의 직업을 골라주세요.\n1.Worrier\t2.Mage\t3.Archer\t4.Assassin"));
		switch(kind) {
		case 1:
			character = new Worrier();
			break;
		case 2:
			character = new Mage();
			break;
		case 3:
			character = new Archer();
			break;
		case 4:
			character = new Assassin();
			break;
			
		}
		System.out.print("[캐릭터 생성 : ");
		if(character instanceof Worrier) {
			System.out.println("Worrier]");
			
		}else if(character instanceof Mage) {
			System.out.println("Mage]");
		}else if(character instanceof Archer) {
			System.out.println("Archer]");
		}else {
			System.out.println("Assassin]");
		}
		
		System.out.println("==================================");
		System.out.println("Hp : "+character.hp+", Mp :"+character.mp);
		System.out.println("==================================");

	}
	
	public void skill(){
		ran = new Random();
		damage = ran.nextInt(52);
		int Cridamage = 100; 
		
		if(character instanceof Worrier) {
			Worrier w = (Worrier) character;
//			System.out.print(w.skill.get(ran.nextInt(w.skill.size())));
			if(damage <= 50) {
				System.out.println(w.skill.get(ran.nextInt(w.skill.size()))+" ("+damage+")");
			}else { //damage == 51일 경우
				System.out.println(w.skill.get(ran.nextInt(w.skill.size()))+" Critical Damage!! ("+Cridamage+")");
			}
		}else if(character instanceof Mage){
			Mage m = (Mage) character;
//			System.out.print(m.skill.get(ran.nextInt(m.skill.size())));
			if(damage <= 50) {
				System.out.println(m.skill.get(ran.nextInt(m.skill.size()))+" ("+damage+")");
			}else { //damage == 51일 경우
				System.out.println(m.skill.get(ran.nextInt(m.skill.size()))+" Critical Damage!! ("+Cridamage+")");
			}
		}else if(character instanceof Archer){
			Archer a = (Archer) character;
//			System.out.print(a.skill.get(ran.nextInt(a.skill.size())));
			if(damage <= 50) {
				System.out.println(a.skill.get(ran.nextInt(a.skill.size()))+" ("+damage+")");
			}else { //damage == 51일 경우
				System.out.println(a.skill.get(ran.nextInt(a.skill.size()))+" Critical Damage!! ("+Cridamage+")");
			}
		}else {
			Assassin ass = (Assassin) character;
//			System.out.print(ass.skill.get(ran.nextInt(ass.skill.size())));
			if(damage <= 50) {
				System.out.println(ass.skill.get(ran.nextInt(ass.skill.size()))+" ("+damage+")");
			}else { //damage == 51일 경우
				System.out.println(ass.skill.get(ran.nextInt(ass.skill.size()))+" Critical Damage!! ("+Cridamage+")");
			}
		}
		
//		swith문에 character를 인자로 받고, 그 인자의 데이터 타입이 무엇인가에 따라서 서로 다른 데이터 타입인 객체를 만드는것 가능?
//		switch(character) {
//		case Worrier
//		}
		
	}
	
	public void DoSomeThing() {
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1.기본 공격\t2.랜덤 스킬사용\t3.방어\t4.도망");
		int Q = Integer.parseInt(JOptionPane.showInputDialog("무엇을 하시겠습니까?\n1.기본 공격하기		2.랜덤 스킬사용하기		3.방어하기		4.도망치기"));
		boolean shield;
		switch(Q) {
		case 1:
			System.out.println("Hit! (5)");
			break;
		case 2:
			skill();
			character.mp -= 15;
			System.out.println("====================");
			System.out.println("Hp : "+character.hp+", Mp : "+character.mp);
			System.out.println("====================");
			break;
		case 3:
			shield = ran.nextBoolean();
			if(shield) {
				System.out.println("막았습니다.");
				System.out.println("====================");
				System.out.println("Hp : "+character.hp+", Mp : "+character.mp);
				System.out.println("====================");
			}else {
				System.out.println("막지 못했습니다.");
				character.hp -= 10;
				System.out.println("====================");
				System.out.println("Hp : "+character.hp+", Mp : "+character.mp);
				System.out.println("====================");
			}
			break;
		case 4:
				System.out.println("도망쳤습니다.");
			break;
		}
		
		
		
	}
}

