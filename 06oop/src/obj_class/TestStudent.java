package obj_class;

public class TestStudent {
	String name;
	int kor, math, eng;
	void TestStudent() {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
	}
	public int sum() {
		return (this.kor + this.math + this.eng);
	}
	public int avg2() {
		return (this.kor + this.math + this.eng)/3;
	}
}
