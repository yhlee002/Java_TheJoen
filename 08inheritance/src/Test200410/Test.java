package Test200410;

import javax.swing.JOptionPane;

/*
 * 상속을 이용
 * has-a, is-a가 있어야 함
 * ArrayList사용할 것
 * 속성은 private으로 만들것
 * 접근할 수 있는 set, get 메소드로 속성접근
 */
public class Test {
	public static void main(String[] args) {

		Person p = new Person();
		p.makeCharacter();
		p.character.setName(JOptionPane.showInputDialog("캐릭터명을 입력하시오."));
		System.out.println(p.character.getName());
		
		p.DoSomeThing();
		
	}
	
}
