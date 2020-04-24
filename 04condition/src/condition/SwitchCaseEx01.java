package condition;

public class SwitchCaseEx01 {
	public static void main(String[] args) {
		//switch문
		int menu = 2;
		
		if(menu == 1) {
			System.out.println("삼겹살을 선택했습니다.");
		}else if(menu == 2) {
			System.out.println("파스타를 선택했습니다.");
		}else if(menu == 3) {
			System.out.println("초밥을 선택했습니다.");
		}
		
		System.out.println("-----------------------------");
		
		switch(menu) {
			case 1 :
				System.out.println("삼겹살을 선택했습니다.");
				break;
			case 2 :
				System.out.println("파스타를 선택했습니다.");
				break; //break가 없으면 해당되는 case의 문장들이 실행되면서 그 case의 아래 타 case의 문장들도 모두 실행됨
						//즉, break를 만나기 전까지 계속해서 실행됨
			case 3 :
				System.out.println("초밥을 선택했습니다.");
				break;
			
		}
	}
}
