package abstractEx01;

public abstract class Animal {
	String species;
	
	public abstract void cry(String name, String uu);
	
	public void move() {
		System.out.println("움직인다.");
	}
}
