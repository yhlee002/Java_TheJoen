package condition;

import java.util.Scanner;

public class Test200401_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//3
		System.out.println("국적를 입력하시오.");
		String country = sc.next();
		
		if(country.equals("Korea")) {
			System.out.println("지역(시)을 입력하시오.");
			String si = sc.next();
			System.out.println("나이를 입력하시오.");
			int age = sc.nextInt();
			
			if(si.equals("Jejusi")||si.equals("Seoguiposi")) {
				System.out.println("요금 : 3,000");
			}else {
				if(age >= 20) {
					System.out.println("요금 : 10,000");
				}else if(age < 20) {
					System.out.println("요금 : 5,000");
				}
			}
		}else {
			System.out.println("요금 : 15,000");
		}
		System.out.println("===================");
		
		sc.close();
	}
}


