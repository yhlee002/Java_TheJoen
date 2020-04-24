package array02;

public class Subject {
	public String name;
	public int score;

	Subject(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public void getInfo(){
		System.out.println("name : "+name+", score : "+score);
	}
}
