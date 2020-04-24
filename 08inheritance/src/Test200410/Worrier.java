package Test200410;

import java.util.ArrayList;

public class Worrier extends Character{
	
	public Worrier() {
		hp = 1000;
		mp = 200;
		
		skill = new ArrayList<String>();
		skill.clear();
		skill.add("Final Attack");
		skill.add("Blast");
		skill.add("Magic Crash");
	}
	
}
