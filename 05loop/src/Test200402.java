
public class Test200402 {

	public static void main(String[] args) {
		//1--------------------------------------------
		System.out.println("1번 문제 10~0 출력. While문");
		int num = 11;
		while(num > 0) {
			System.out.print((num-1) + " ");
			num--;
		}
		System.out.println("\n----------------------------");
		
		System.out.println("1번 문제 10~0 출력. For문");
		for(num = 11; num > 0; num--) {
			System.out.print((num-1) + " ");
		}
		System.out.println("\n============================"); 
		
		//3--------------------------------------------
		System.out.println("3번 문제 - 안녕하세요. 출력 While문");
		int i = 0;
		while(i < 5) {
			System.out.println("안녕하세요."+(i+1));
			i++;
		}
		System.out.println("----------------------------");
		
		System.out.println("3번 문제 - 안녕하세요. 출력 For문");
		for(i = 0; i < 5; i++) {
			System.out.println("안녕하세요."+(i+1));
		}
		System.out.println("============================");
		
		//4--------------------------------------------
		System.out.println("4번 문제 - 1~10까지의 합을 구하는 코드를 작성하시오. while문");
		int j = 1;
		int sum = 0;
		String str = "";
		System.out.print("합의 변화 : ");
		while(j <= 10) {
			sum += j;
			if(j == 1) {
				str = str + j;
			}else {
				str = str + "+" + j;
			}
			System.out.println(str + " : " + sum);
			j++;
		}
		System.out.println("\n----------------------------");
		
		System.out.println("4번 문제 - 1~10까지의 합을 구하는 코드를 작성하시오. for문");
		
		sum = 0;
		str = "";
		for(j = 1; j <= 10; j++) {
			sum += j;
			if(j == 1) {
				str = str + j;
			}else {
				str = str + "+" + j;
			}
			System.out.println(str + " : " + sum);

		}
		System.out.println("\n============================");
		
		//5--------------------------------------------
		System.out.println("5번 문제 - 20~40까지 중 6의 배수를 출력하는 코드를 작성하시오. While문");
		i = 20;
		while(i <= 40) {
			if(i%6 == 0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println("\n----------------------------");
		
		System.out.println("5번 문제 - 20~40까지 중 6의 배수를 출력하는 코드를 작성하시오. For문");
		for(i = 20; i <= 40; i++) {
			if(i%6 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n============================");
		
		//6--------------------------------------------
		System.out.println("6번 문제 - 20의 약수를 출력하는 코드를 작성하시오. While문");
		int num1 = 1;
		while(num1 <= 20) {
			if(20%num1 == 0) {
				System.out.print(num1 + " ");
			}
			num1++;
		}
		System.out.println("\n----------------------------");
		
		System.out.println("6번 문제 - 20의 약수를 출력하는 코드를 작성하시오. For문");
		for(num1 = 1; num <= 20; num1++) {
			if(20 % num1 == 0) { 
				System.out.print(num1 + " ");
			}
		}
		System.out.println("\n============================");
		
		//continue를 이용해서 1~20까지의 수 중 3의 배수를 제외하고 출력하시오.(while)
		System.out.println("Continue사용 while문");
		int n = 1;
		while(n <= 20) {
			if(n%3 == 0) {
				n++;
				continue;
			}
			System.out.print(n+" ");
			
		}
		
		//break를 이용해서 1~20까지의 수 중 15(미포함) 보다 작은 수까지의 합을 구하시오.(for)
		System.out.println("Break사용 For문");
		int sum1 = 0;
		for(n = 1; n <= 20; n++) {
			if(n == 15) {
				break;
			}
			sum1 += n;
			System.out.print(sum1+" ");
		}
	}
}
