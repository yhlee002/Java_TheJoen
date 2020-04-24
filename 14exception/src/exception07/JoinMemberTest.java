package exception07;

import java.util.Scanner;

public class JoinMemberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JoinMember jm = new JoinMember();
		
		boolean isEnd = false;
		while(!isEnd) {
			System.out.println("[아이디를 입력하세요.]");
			String id = sc.nextLine();
			System.out.println("[비밀번호를 입력하세요.]");
			String pwd = sc.nextLine();
			
			try {
				isEnd = jm.join(id, pwd);
			} catch (MyException e) {
				System.out.println(e.getMessage());
				System.out.println("다시 입력하세요.\n");
			}
		}
		System.out.println("[회원가입 완료]");
		sc.close();
	}
}
