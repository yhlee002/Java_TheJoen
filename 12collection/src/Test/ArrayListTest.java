package Test;
//ArrayList 또는 LinkedList를 이용해서 Student(이름, 나이) 객체를 추가 삭제하는 코드를 작성.
//사용자로부터 입력받아서 객체를 리스트에 추가하고, 리스트의 모든 학생의 이름과 나이를 출력하세요.
import java.util.LinkedList;
import java.util.Scanner;

class Student{
	String name;
	int age;
	
//	public Student(String name) {
//		this.name = name;
//	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return name+"("+age+")";
	}
	
	public void printInfo() {
		System.out.println(getName() + "학생의 나이는 " + getAge() + "세 입니다.");
	}
}

public class ArrayListTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int replay = 0;
		int doThing = 0;
		int i = 0;
		LinkedList<Student> stList = new LinkedList<Student>();
		
		
		do {
			System.out.println("1.수정\t2.삭제");
			doThing = sc.nextInt();
			
			switch(doThing) {
			
			case 1 : 
				stList.add(new Student());
				System.out.println("이름을 입력하세요.");
				stList.get(i).setName(sc.next());
				System.out.println("나이를 입력해주세요.");
				stList.get(i).setAge(sc.nextInt());
				System.out.println(stList);
				i++;
				break;
				
			case 2 :
				if(stList.isEmpty()) {
					System.out.println("더이상의 학생이 존재하지 않습니다.");
					break;
				}
				
				System.out.println("몇번째 인덱스의 학생을 제거하시겠습니까?");
				int n = sc.nextInt();
				stList.remove(n);
				System.out.println(stList);
				i--;
				break;
			}
			
			System.out.println("계속하시겠습니까?\n1.계속한다\t2.종료한다");
			replay = sc.nextInt();
			
		}while(replay == 1);
		
//		stList.add(new Student("이영현", 26));
//		stList.add(new Student("짱구", 10));
//		stList.add(new Student("짱아", 8));
//		stList.add(new Student("건담", 20));
		
//		System.out.println(stList.remove(3));
		
		for(Student student : stList) {
			student.printInfo();
		}
		
		sc.close();
	}
	
}
