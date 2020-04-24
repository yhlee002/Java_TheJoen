package abstractEx01;

public class Dog extends Animal{

	
	@Override
	public void cry(String name, String uu) {
		System.out.println(name+"는(은) \""+uu+"\" 하고 운다.");
	}
}
	
