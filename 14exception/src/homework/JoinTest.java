package homework;

import java.util.Scanner;

public class JoinTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, pwd, address;
		Join j = new Join();
		boolean result = false;
		
		while(!result) {
			
			System.out.println("[아이디를 입력하세요.]");
			name = sc.nextLine();
			System.out.println("[비밀번호를 입력하세요.]");
			pwd = sc.nextLine();
			System.out.println("[주소를 입력하세요.]");
			address = sc.nextLine();
			
			try {
				result = j.input(name, pwd, address);
			} catch (NoIdException e) {
				System.out.println(e.getMessage());
				
			} catch (NoPwdException e) {
				System.out.println(e.getMessage());
				
			} catch (NoAddressException e) {
				System.out.println(e.getMessage());
				
			}
			
		}
		sc.close();
	}
	
}
