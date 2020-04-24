package Test200410;

import java.util.ArrayList;

public class Archer extends Character{
	
	public Archer() {
		hp = 700;
		mp = 500;
		
		skill = new ArrayList<String>();
		skill.clear();
		skill.add("Arrow Blow!!! ");
		skill.add("Explosive Bolt!!");
		skill.add("Pain Killer!!");
	}
}
