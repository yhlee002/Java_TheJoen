
public class OperationEx3 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 7) < 10);
		System.out.println(value); //value = false
		System.out.println(num1); //num1 = 10 + 10 = 20
		System.out.println(i); //i = 2 (우항 실행X)
		
		value = ((num1 = num1 + 10)> 10) || ((i = i + 2) < 10);
		System.out.println(value); //value = 30 > 10 || i  = 4 < 10
		System.out.println(num1); //num1 = 20 + 10 = 30
		System.out.println(i); //i = 2(우항 실행X)
		
	}
}
