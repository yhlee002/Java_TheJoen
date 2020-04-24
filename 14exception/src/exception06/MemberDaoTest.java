package exception06;

import java.util.Scanner;

public class MemberDaoTest {
	public static void main(String[] args) {
		//사용자로부터 입력받은 ID를 MemberDao를 통해 DB에 저장
		Scanner sc = new Scanner(System.in);
		MemberDao dao = new MemberDao();
		while(true) {
			System.out.println("ID를 입력하세요.");
			try {
				dao.inputId(sc.next());
			} catch (DuplicateIdException e) {
				System.out.println("ID가 중복되었습니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}	
		}
		sc.close();
	}
}
