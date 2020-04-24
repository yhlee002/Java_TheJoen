package MyHomeWork200407;

public class MyHomeWork2 {
	int avg, sum;
	String explan;
	
	public void setExplan(String str) {
		this.explan = str;
	}
	public void setSum(int x, int y, int z) {
		this.sum = x+y+z;
	}
	public void avg() {
		this.avg = this.sum/3;
	}
	public String re_str() {
		return explan+". 평균 : "+avg+", 합 : "+sum;
	}
	public void print() {
		System.out.println(explan+", 평균 : "+avg+", 합 : "+sum);
	}
}
