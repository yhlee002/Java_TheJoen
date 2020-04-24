package exceptionTestCopy;

import java.util.InputMismatchException;
import java.util.MissingResourceException;
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee em1 = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee1");
		while(true) {
			try {
				System.out.println("name : ");
				em1.setName(sc.nextLine());
				if(em1.getName().isEmpty()) {
					throw new NullPointerException();
				}
			} catch(NullPointerException e) {
				System.out.println("빈값입니다.");
				sc.nextLine();
				continue;
			}
			break;
		}
		while(true) {
			try {
				System.out.println("salary : ");
				em1.setSalary(sc.nextInt());
				if(em1.getSalary()<0) {
					throw new ArithmeticException();
				} 
			} catch(ArithmeticException e) {
				System.out.println("마이너스 입력 불가");
				sc.nextLine();
				continue;
			} catch(InputMismatchException e) {
				System.out.println("숫자 이외 입력 불가");
				sc.nextLine();
				continue;				
			}
			break;
		}
		System.out.println("department : ");
		em1.setDepart(sc.next());
		
		System.out.println(em1.toString());
	}
}
