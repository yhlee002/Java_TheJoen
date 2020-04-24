package inheritance;

public class MyParentClass {
	private int number;
	private String name;
	private String[] hobby;
	
	public MyParentClass(int number, String name, String[] hobby) {
		this.number = number;
		this.name = name;
		this.hobby = hobby;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getHobby() {
		return hobby;
	}
}
