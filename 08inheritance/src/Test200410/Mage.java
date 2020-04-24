package Test200410;

import java.util.ArrayList;

public class Mage extends Character {
	
	public Mage() {
		hp = 500;
		mp = 1500;
		
		skill = new ArrayList<String>();
		skill.clear();
		skill.add("Ice Strike");
		skill.add("Thunderstorm");
		skill.add("Glacier Chain");
	}

}
