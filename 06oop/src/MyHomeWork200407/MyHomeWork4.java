package MyHomeWork200407;

public class MyHomeWork4 {
	String str;
	
	public int A(int x) {
		return x*x;
	}
	public void B(int x) {
		for(int i=1;i<10;i++) {
			System.out.print(x+"*"+i+"="+x*i+"\t");
		}
		System.out.println();
	}
	public void C(int y) {
		str = "";
		for(int i=1;i<10;i++) {
			str += (y+"*"+i+"="+y*i+"\t");
		}
		System.out.println(str);
	}
	public String returnStr() {
		return str;
	}
}
