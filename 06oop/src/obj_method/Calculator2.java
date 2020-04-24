package obj_method;

public class Calculator2 {
	//두 수를 인자로 받아 합을 반환하는 메소드.
	public int sum(int num0, int num1) {
		int result = num0+num1;
		return result;
	}
	//파라미터==인자==매개변수
	//반환하는 값은 하나여야만 한다!
	//반환 타입을 적으면, 반환타입에 맞는 return이 꼭 있어야함.

	//double형 파라미터 두개를 받아 합을 반환하는 메소드
	public double sum(double num1, double num2) {
		return num1+num2;
	}
	//같은 이름의 메소드를 다른이름의 매개변수를 이용해서 활용하는 것을 메소드 오버로딩이하 한다!
	//오버로딩을 하는 이유 : 같은 이름으로 메소드를 호출하면서도 다양한 매개변수를 활용할 수 있다!

	//int형 파라미터 두개를 받아 두수의 차이를 반환하는 메소드
	public int sub(int num1, int num2) {
		return ((num1-num2)>0)? num1-num2 : num2-num1;
	}
	
	//int형 파라미터 두개를 받아 두수의 곱을 반환하는 메소드
	public int mul(int n1, int n2) {
		return n1*n2;
	}
	
	//int형 파라미터 두개를 받아 나눈 몫을 반환하는 메소드
	public int div(int n1, int n2) {
		if(n2 != 0) {
			return n1/n2;
		} else {
			return 0;
		}
	}
	//예외 처리!! 0으로 나눌경우.
	//else또는 if문 바깥으로 return을 반드시 넣어야 한다!
}