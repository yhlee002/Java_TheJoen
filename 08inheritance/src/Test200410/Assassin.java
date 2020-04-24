package Test200410;

import java.util.ArrayList;

public class Assassin extends Character {
	
	public Assassin() {
		hp = 100;
		mp = 70;
		
		skill = new ArrayList<String>();
		skill.clear();
		skill.add("Dark Crow Attack!!");
		skill.add("Black Spider Strike!!");
		skill.add("Blade of Steel!!");
		
	}

}
