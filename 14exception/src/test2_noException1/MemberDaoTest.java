package test2_noException1;

import java.util.Scanner;

public class MemberDaoTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDao dao = new MemberDao();
		
		String id = "";
		int retry = 0;
		while(retry == 0) {
			System.out.println("ID를 입력하세요.");
			id = sc.nextLine();
			dao.InputId(id);
			
			System.out.println("반복?\t0.반복 1.종료");
			retry = sc.nextInt();
			sc.nextLine();
		}
		
		sc.close();
	}
}
