package test2_noException2;

import java.util.Scanner;

public class MemberDaoTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDao dao = new MemberDao();
		
		String id = "";
		int retry = 0;
		do {
			System.out.println("ID를 입력하세요.");
			id = sc.nextLine();
			
			boolean what = dao.InputId(id);
			
			if(what) {
				System.out.println("반복?\t0.반복 1.종료");
				retry = sc.nextInt();
				sc.nextLine();
			
			}else {
				System.out.println("ID가 중복되었습니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
		}while(retry == 0);
		
		sc.close();
	}
}
