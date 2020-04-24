package Test;

public class MyCalcul {
	int num;
	public int add(int a) {
		return num+a;
	}
	public int mul(int a) {
		return num*a;
	}
	public double div(double a) {
		return (a!=0)?(double)num/a:0;
	}
	public int sub(int a) {
		return num-a;
	}
}