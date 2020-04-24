package inheritance04;

public class Medic extends Unit{
	public Medic() {
		super("메딕");
//		name = "메딕";
		energy = 200;
	}
	public void healing() {
		System.out.println("치료를 합니다.");
	}
	@Override
	public void attack() {
		System.out.println("치료를 합니다.");
	}
}


