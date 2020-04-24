package exception07;

import java.util.Scanner;

public class OnePieceTest {
	public static void main(String[] args) {
		//dao를 통해 입력된 id값에 해다오디는 이름을 조회해서 가져오는 프로그램
		Scanner sc = new Scanner(System.in);
		OnePieceDao dao = new OnePieceDao();
		
		System.out.println("ID를 입력하세요.");
		String id = sc.nextLine();
		String name = null;
		try {
			name = dao.selectOne(id);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			name = "@@"; 
		}
		System.out.println("이름은 : "+name);
		
		sc.close();
	}
}
