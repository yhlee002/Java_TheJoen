package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee em1 = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee 1");
		while(true) {
			try {
				System.out.println("Name : ");
				em1.setName(sc.nextLine());
				if (em1.getName().isEmpty()) {
					throw new NullPointerException();
				}
			} catch (NullPointerException e) {
				System.out.println("빈 값을 입력했습니다.");
				sc.nextLine();
				continue;
			}
			break;
		}
		while(true) {
			try {
				System.out.println("Salary : ");
				em1.setSalary(sc.nextInt());
				if (em1.getSalary() < 0) {
					throw new ArithmeticException();
				}
				
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요");
				sc.nextLine();
				continue;
			} catch (ArithmeticException e) {
				System.out.println("음수는 입력할 수 없습니다.");
				sc.nextLine();
				continue;
			}
			break;
		}
		sc.nextLine();
		System.out.println("Department : ");
		em1.setDepart(sc.next());
		System.out.println(em1.toString());
	}
}
