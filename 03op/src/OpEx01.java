
public class OpEx01 {
	//Main Method : Java Program이 실행할 때 가장 먼저 호출
	public static void main(String[] args){
		//대입 연산자(=), 산술 연산자(+, -, *, /, %)
		int num1 = 10;
		int num2 = 20;
		int num3 = 5;
		int num4 = 7;
		
		System.out.println("num1은 "+num1); // 'num은 10' 출력
		num1 = num1 + 1; //11
		num1 = num1 + num1; //22
		num1 = num1 + num1 + num2; //64
		
		System.out.println("num3 - num4 = "+(num3 - num4)); //-2
		System.out.println("num2 * num3 = "+num2 * num3); //100
		System.out.println("num2 * (num1 = 10)"+(num2 * (num1 = 10))); //200
		System.out.println("num1 = "+num1); //10
		System.out.println("num3 + num1 * num2 = "+ (num3 + (num1 * num2))); //205
		System.out.println("num4 % num3 = "+num4 % num3); //2
		System.out.println("num1 + num4 % num3 = "+(num1 + (num4 % num3)));
		
		int num5 = 0;
		int num6 = 5;
		System.out.println(num5 * num6);
		System.out.println(num5 / num6);
		try {
		System.out.println(num6 / num5);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		System.out.println("으하하하하하하하");
		System.out.println(num1 = num2 = num3 = num4); //7
	}

}
