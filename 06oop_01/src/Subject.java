
public class Subject {
	//과목을 관리하는 클래스
	//속성 : 과목명, 점수
	String name; // 과목명
	private int score;
	//private은 자기 자신의 클래스 내에서만 접근 가능하다.
	
	//score라는 정수를 set해주는 메소드
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
}
