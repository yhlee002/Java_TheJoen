package condition;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class SwitchCaseEx01Test {
	public static void main(String[] args) {
		//사용자에게 숫자를 입력받아서 1이면 일등입니다. 2이면 이등입니다. 3이면 삼등입니다 출력
		int number =  Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하시오."));
		
		switch(number) {
		case 1 :
			System.out.println("일등입니다.");
			break;
		case 2 : 
			System.out.println("이등입니다.");
			break;
		case 3 :
			System.out.println("삼등입니다.");
			break;
		}
		
		//사용자로부터 문자열을 입력받는다. "당신의 티어는 어디?" iron, bronzer, silver, gold, platinum, dia, master, challenger
		//"철인 이구만", "브실골", "브실골", "브실골", "플레티넘", "다이아~~", "오~ 마스터!!", "굳"
		Scanner sc = new Scanner(System.in);
		String rank = JOptionPane.showInputDialog("티어가 어디입니까?");
//		System.out.println("티어가 어디입니까?");
//		String rank = sc.next();
		switch(rank) {
		case "iron" :
			System.out.println("철인 이구만");
			break;
		case "bronze" :
		case "silver" :
		case "gold" :
			System.out.println("브실골"); //bronze, silver, gold 모두 같은 문자열을 출력하기 때문에 
			break;						//break문이 없으면 break를 만나기 전까지 실행되는 점을 이용할 수 있다.
		case "platinum" :
			System.out.println("플레티넘!!");
			break;
		case "dia" :
			System.out.println("다이아~~");
			break;
		case "master" :
			System.out.println("오~ 마스터!!");
			break;
		case "challenger" :
			System.out.println("굳");
			break;
		}
		sc.close();
	}
}
