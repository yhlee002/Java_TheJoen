import java.util.Scanner;
public class OpEx07Test {
	public static void main(String[] args) {
		//실습
		
		//1
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 밑변의 길이를 입력하시오.");
		int a = scan.nextInt();
		System.out.println("삼각형의 높이를 입력하시오.");
		int b = scan.nextInt();
		int ab = (a*b);
		int abc = ab*100;
		double abcc = (abc/2)/100.0;
		System.out.println("=>삼각형의 넓이 : "+abcc);
		
		//2
		System.out.println("원의 반지름을 입력하시오.");
		int r = scan.nextInt();
		double rr = r*r*3.14;
		double rr2 = r*2*3.14;
		System.out.println("=>원의 넓이 : "+rr);
		System.out.println("=>원의 둘레 : "+rr2);
		
		//3
		System.out.println("사각형의 가로를 입력하시오");
		int c = scan.nextInt();
		System.out.println("사각형의 세로를 입력하시오");
		int d = scan.nextInt();
		int cd = 2*c + 2*d;
		System.out.println("=>사각형의 둘레 : "+cd);
		
		//4
		/*몇일, 몇시간, 몇분, 몇초인지 출력하시오. 1시간 : 3600초, 하루 : 86400초*/
		System.out.println("초를 입력하시오.");
		int sec = scan.nextInt();
		
		System.out.print(sec/86400+"일\t");
		sec %= 86400;
		System.out.print(sec/3600+"시간\t"); //  = sec % 86400 / 3600
		sec %= 3600;
		System.out.print(sec/60+"분\t"); // = sec % 86400 % 3600 / 60
		sec %= 60;
		System.out.println(sec+"초"); // = sec % 86400 % 3600 % 60
		
		//5
		/*사과 하나가 352원. 사과 7개를 사고 10만원 짜리를 냈다면 얼마를 거슬러 받아야 하는지. 각 지폐 단위 당 몇개인지 구하시오.*/
		int apple = 352;
		int change = 100000 - 7*apple;
		System.out.println("거스름돈 : "+change); //97536
		System.out.print("5만원 : "+change/50000+"장\t");
		change %= 50000;
		System.out.print("1만원 : "+change/10000+"장\t");
		change %= 10000;
		System.out.print("5천원 : "+change/5000+"장\t");
		change %= 5000;
		System.out.print("천원 : "+change/1000+"장\t");
		change %= 1000;
		System.out.print("오백원 : "+change/500+"개\t");
		change %= 500;
		System.out.print("백원 : "+change/100+"개\t");
		change %= 100;
		System.out.print("오십원 : "+change/50+"개\t");
		change %= 50;
		System.out.print("십원 : "+change/10+"개\t");
//		각 지폐의 개수를 변수로 바꾸어 표시할 경우 아래와 같이 표현 가능(변수를 사용하면 코드는 많아지지만 유지보수 쉬움)
//		System.out.printf("오만원 %d장, 만원 %d장, 오천원 %d장, 천원 %d장, 오백원 %d개, 백원 %d개, 오십원 %d개, 십원 %d개", 각 결과를 담은 변수);
		scan.close();
	}
}
