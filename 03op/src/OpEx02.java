
public class OpEx02 {
	public static void main(String[] args) {
		//단항연산자, 증감 연산자(++, --) : 항을 1씩 증가 혹은 감소
		int num1 = 10;
		System.out.println(++num1); //11
		System.out.println(--num1); //10
		
		int num2 = 10;
		System.out.println(num2 + 1); //11
		System.out.println(num2 - 1); //9
		
		//전위 : 먼저 수행, 후위 : 라인이 끝나면(;) 수행
		int num3 = 10;
		System.out.println(++num3); //11
		System.out.println(num3++); //11
		System.out.println(num3); //12
		
		int num4 = 10;
		num4++;
		System.out.println(num4); //11
		
		int num5 = 10;
		num5++; //10
		num5 = num5++; //num5에 11 대입
		++num5; //num5는 12가 됨
		num5 = num5+++num5; //num5 = 13 + 12 *같은 증감 연산자끼리는 왼쪽부터 연산
		System.out.println(num5); //25
		
		num5 = 10;
		num5++; //10
		System.out.println("num5 : "+num5); //11
		++num5; //12
		int a = num5; //12
		int b = num5; //12
		num5 = a+++b; // = (a++) + b //a++ + (b=a)로 a값의 증가를 확인 가능
		System.out.println("a : "+a); //13
		System.out.println("b : "+b); //12
		System.out.println("num5 : "+num5); //24
	}
}
