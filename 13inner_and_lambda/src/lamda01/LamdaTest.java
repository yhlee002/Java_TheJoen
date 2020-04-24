package lamda01;

public class LamdaTest {
	public static void main(String[] args) {
		Calc c = new Calc() {
			public int add(int num1, int num2) {
				return num1+num2;
			}
		};
		
		Calc c1 = (a, b) ->{return a+b;};
		
	}
}
