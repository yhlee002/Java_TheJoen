package setEx01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetTest02 {
	public static void main(String[] args) {
		/*
		 * Set
		 * HashSet, TreeSet 모두 자료형을 Set으로 사용 가능
		 */
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new TreeSet<String>();
		
		//Set이 중복을 허용하지 않는 것을 이용할 수 있다.
		System.out.println(set1.add("사과"));
		System.out.println(set1.add("사과")); //중복입력된 값은 인정되지 X
		
		//사용자로부터 과일이름을 5개 입력받도록 하는데 중복이 되면 다시 입력하도록 구현하시오.
		Scanner sc = new Scanner(System.in);
		HashSet<String> set3 = new HashSet<String>();
		
		System.out.println("과일 이름을 입력하세요.");
		while(set3.size() < 5){
			if(!set3.add(sc.next())) {
				System.out.println("다시 입력해주세요.");
			}
		}
		System.out.println(set3);
//		do{
//			System.out.println("과일 이름을 입력하시오.");
//			String str = sc.next();
//			if(set3.contains(str)) {
//				System.out.println("다시 입력하시오.");
//				continue;
//			}
//			set3.add(str); 
//			
//		}while(set3.size() < 5);
//		
//		Iterator<String> set4 = set3.iterator();
//		
//		while(set4.hasNext()) {
//			System.out.print(set4.next()+" ");
//		}
//		System.out.println();
		
		//지하철역 10개가 모두 다른 역을 입력할때까지 입력을 받고 그동안 중복된 역과 개수를 출력
		HashSet<String> sub = new HashSet<String>();
		HashSet<String> duplication = new HashSet<String>();
		System.out.println("역 이름을 입력하세요.");
		int cnt = 0;
		String str = "";
		while(sub.size() < 10) {
			str = sc.next();
			if(!sub.add(str)) {
				System.out.println("다시 입력해주세요.");
				duplication.add(str);
				cnt++;
			}
		}
		System.out.println("중복 입력된 역 : ");
		System.out.println(duplication);
		System.out.println("중복 횟수 : "+cnt);
		System.out.println(sub);
		sc.close();
	}
}
class Subway{
	String name;
	int joongbokN;
	public Subway(String name, int joongbokN) {
		this.name = name;
		this.joongbokN = joongbokN;
	}
}
