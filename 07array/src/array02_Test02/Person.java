package array02_Test02;
import java.util.Scanner;

public class Person {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수");
		int N = sc.nextInt();
		
		String[] hobby = new String[N];
		
		String output = "";
		for(int i=0; i<hobby.length; i++) {
			hobby[i] = sc.next();
			output += hobby[i]+" ";
		}
		
		System.out.println("[ hobby : "+output+"]");
		sc.close();
	}
}
