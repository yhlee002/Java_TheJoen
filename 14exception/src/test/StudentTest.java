package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class StudentTest{//세 명의 학생의 정보를 입력받고, 총 평균을 구하는데 널 포인터 발생시 '널 입니다' 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //배열에 객체를 생성하지 않고 넣은 뒤 꺼내려고 해보기(NullPointerException 발생 유도)
		HashMap<String, Score> stuArr = new HashMap<String, Score>();
		for(int i = 0; i < 3; i++) {
			Score score = null;
//			score = new Score();
			System.out.println("학생의 이름을 입력하세요.");
			String name = sc.nextLine();
			stuArr.put(name, score);
			try {
				System.out.println(name+"학생의 국어 성적을 입력하세요.");
				int kor = sc.nextInt();
				sc.nextLine();
				stuArr.get(name).setKor(kor);
				System.out.println(name+"학생의 영어 성적을 입력하세요.");
				int eng = sc.nextInt();
				stuArr.get(name).setKor(eng);
				System.out.println(name+"학생의 수학 성적을 입력하세요.");
				int math = sc.nextInt();
				stuArr.get(name).setKor(math);
			}catch(NullPointerException e){
				System.out.println("널 입니다.");
			}
			
		}
		//
		Collection<Score> se = stuArr.values();
		int avgSum = 0;
		for(Score score : se) {
			avgSum += score.getAvg();
			System.out.println(avgSum/stuArr.size());
			
		}
		
		
		
		
		sc.close();
	}
}