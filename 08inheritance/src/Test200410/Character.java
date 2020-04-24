package Test200410;

import java.util.ArrayList;

public class Character {
	
	protected String name;
	protected int hp;
	protected int mp;
	protected ArrayList<String> skill;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return "캐릭터명이 "+name+"으로 설정되었습니다.";
	}
	
	
//	public Character() {
//		this.skill = new ArrayList<String>();
//	}
}
