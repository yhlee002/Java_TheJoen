package obj_class;

public class NewStudent {
	String name;
	int kor;
	int math;
	int eng;
	
	//평균을 구해서 출력해주는 메소드
	//(접근지정자) 반환타입 메소드이름(파라미터 타입 변수){ 실행할 문장; }
	//반환타입에서의 void는 반환을 하지 않음을 의미.
	public int sum() {
		return kor+math+eng;
	}
	public int avg() {
		return (kor+math+eng)/3;
	}
	
	public void print() {
		System.out.println(name+"의 [kor]"+" : "+kor+", [math]"+" : "+math+", [eng]"+" : "+eng);
		System.out.println("<평균>"+avg());
	}
}
