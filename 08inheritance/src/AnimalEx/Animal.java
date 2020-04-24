package AnimalEx;

public class Animal {
	String type;
	String sound;
	
	public Animal(String name, String type, String sound){
		this.type = type;
		this.sound = sound;
		System.out.println(name+"는(은) "+type+"이며 \""+sound+"\" 하고 운다.");
	}
}
