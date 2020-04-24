package date01;

/*	Calendar class의 내부 구조는 대략 이렇게 되어있다.
 * (new로 객체를 생성하지 못하고 메소드를 사용해서 객체를 생성하는 이유)
 */

public class MyCal {
	
	private MyCal() { }//생성자가 private이라는 것은 외부에서 생성하는 것을 막음
	public static MyCal getInstance() {
		return new MyCal();
	}
}
