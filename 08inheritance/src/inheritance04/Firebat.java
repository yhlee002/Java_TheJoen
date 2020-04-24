package inheritance04;

public class Firebat extends Unit{
	
	public Firebat() {
		super("파이어뱃"); //new Unit();과 같은 의미.
//		name = "파이어뱃";
	}
	boolean steamState;
	public void steampack() {
		System.out.println("스팀팩 사용");
		steamState = true;
	}
	
}
