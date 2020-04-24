package obj_class;

public class TestStudent2 {
	//생성자 없이 값 받기(setter)
	String name;
	int num;

	public void getOprand(String name,int num) { //setter의 역할
		this.name = name;
		this.num = num;
		print();
	}
	private void print() {
		System.out.println("name : "+name+", num : "+num);
	}
}
