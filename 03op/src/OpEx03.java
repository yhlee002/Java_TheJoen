
public class OpEx03 {
	public static void main(String[] args) {
		//관계연산자(>(gt), <(lt), <=, >=, ==, !=) : 모든 값은 불린(Boolean)형태로 나온다.
		int num1 = 10;
		int num2 = 5;
		int num3 = 10;
		System.out.println(10 > 5); //true
		System.out.println(num1 > num2); //true
		// num2는 num3보다 작거나 같은가?
		System.out.println(num2 <= num3); //true
		//num3은 num1과 같은가?
		System.out.println(num3 == num1); //true
		//num3은 num2와 같은가?
		System.out.println(num3 == num2); //false
		//num3은 num3보다 크거나 같은가?
		System.out.println(num3 >= num3); //true
		//num2는 5와 다른가?
		System.out.println(num2 != 5); //false
		//숫자 5와 숫자 5는 같은가?
		boolean result = (5 == 5);
		System.out.println("result : "+result); //true
		
		
	}
}
