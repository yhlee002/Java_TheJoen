package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class TestClass {
	public static void main(String[] args) {
		String s1 = "I'm groot, and I'm groot!";
		
		//위 문자열에서 and의 위치를 출력하시오.
		System.out.println("s1에서 and의 위치 : "+s1.indexOf("and"));
		
		//위 문자열에서 and I'm을 추출하여 대문자로 출력하시오.
		String andIm = s1.substring(s1.indexOf("and I'm"), s1.indexOf("and I'm")+"and I'm".length()).toUpperCase();
		System.out.println(andIm);
		
		
		
		
		//아래 s2의 문자열에서 hello 문자를 추출하여 대문자로 변경 후 앞뒤로 !를 붙여 출력하시오.
		String s2 = "<div>hello<div>";
		
		String s2Hello = s2.substring(s2.indexOf("hello"), s2.indexOf("hello")+"hello".length());
		StringBuilder sb = new StringBuilder("!");
		sb.append(s2Hello.toUpperCase()+"!");
		System.out.println(sb);
		
		
		
		//아래 s3을 계산하여 출력하시오.
		String s3 = "320+400+20";
		
		int three = Integer.parseInt(s3.substring(s3.indexOf("320"), s3.indexOf("320")+"320".length()));
		int four = Integer.parseInt(s3.substring(s3.indexOf("400"), s3.indexOf("400")+"400".length()));
		int two = Integer.parseInt(s3.substring(s3.indexOf("20"), s3.indexOf("20")+"20".length()));
		System.out.println("s3의 계산 결과 : "+(three+four+two));
		
		//위 문제의 보다 좋은 접근 방식
		String[] nums = s3.split("\\+");
		int sum = 0;
		for(String string : nums) {
			sum += Integer.parseInt(string);
		}
		System.out.println("총 합 : "+sum);
				
		
		
		//아래 s4, s5, s6에서 <a></a>사이에 들어간 문자열을 추출하여 출력하세요.
		String s4 = "<li><a>추첨안내</a></li>";
		String s5 = "<li><dl><a>Im groot</a></dl></li>";
		String s6 = "<html><body>test<div><li><a>hello world!!</a></li></div></body></html>";
		System.out.println("s4의 문자열 추출 : "+s4.substring(s4.indexOf("<a>")+"<a>".length(), s4.lastIndexOf("</a>"))); 
		System.out.println("s5의 문자열 추출 : "+s5.substring(s5.indexOf("<a>")+"<a>".length(), s5.lastIndexOf("</a>"))); 
		System.out.println("s6의 문자열 추출 : "+s6.substring(s6.indexOf("<a>")+"<a>".length(), s6.lastIndexOf("</a>"))); 
		
		//변수 이용
		int n = 4;
		
		String[] sArr = new String[3];
		sArr[0] = "<li><a>추첨안내</a></li>";
		sArr[1] = "<li><dl><a>Im groot</a></dl></a>";
		sArr[2] = "<html><body>test<div><li><a>hello world!!</a></li></div></body></html>";
		String s = "<a>";
		String e = "</a>";
		int start = 0;
		int end = 0;
		for(String string : sArr) {
			start = string.indexOf(s)+s.length();
			end = string.indexOf(e);
			System.out.println("[보다 간단한 코드(s"+(n++)+")] : "+string.substring(start, end));
			
		}

		
		
		
		//1. set을 이용하여 로또번호를 생성하도록 구현하시오.(1~45까지 숫자 중 6개)
		HashSet<Integer> lotto = new HashSet<Integer>();
		Random ran = new Random();
		while(lotto.size() < 6) {
			lotto.add(ran.nextInt(45)+1);
		}
		System.out.println(lotto);
		
		
		
		/* 
		 * 2. map을 이용하여 키에는 유저id, 값에는(User객체)
		 * User 클래스는 이름, 나이, 이메일, 전화번호, 주소, 포인트가 있으며 
		 * 속성은 모두 private. 생성자,getter, setter도 구현.
		 */
		class User{
			private String name;
			private int age;
			private String email;
			private String phoneNumber;
			private String address;
			private int point;
			
			public User(String name, int age) {
				this.name = name;
				this.age = age;
			}
			
			public void setEmail(String email) {
				this.email = email;
			}
			
			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}
			
			public void setAddress(String address) {
				this.address = address;
			}
			
			public void setPoint(int point) {
				this.point = point;
			}
			
			public String getEmail() {
				return email;
			}
			
			public String getPhoneNumber() {
				return phoneNumber;
			}
			
			public String getAddress() {
				return address;
			}
			
			public int getPoint() {
				return point;
			}
			
			public void getAllInfo(){
				System.out.println("사용자의 이름과 나이 : "+name+"("+age+")");
				System.out.println("사용자의 email : "+getEmail());
				System.out.println("사용자의 핸드폰 번호 : "+getPhoneNumber());
				System.out.println("사용자의 주소 : "+getAddress());
				System.out.println("사용자의 포인트 : "+getPoint());
			}
		}
		HashMap<Integer, User> map = new HashMap<Integer, User>();
		
		/*
		 * 3. 콘솔로 5명의 id와 사용자의 정보를 입력받아 map에 저장하고 
		 * 해당 유저id를 이용하여 사용자의 정보를 조회하도록 하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("사용자의 id를 입력하세요.");
			int id = sc.nextInt();
			System.out.println("사용자의 이름을 입력하세요.");
			String name = sc.next();
			System.out.println("사용자의 나이를 입력하세요.");
			int age = sc.nextInt();
			sc.nextLine(); //남아있는 개행문자를 제거해줌
			
			map.put(id, new User(name, age));
			
			System.out.println("사용자의 주소를 입력하세요.");
			String address = sc.nextLine();
			map.get(id).setAddress(address);
			System.out.println("사용자의 핸드폰 번호를 입력하세요.");
			String phoneNum = sc.next();
			map.get(id).setPhoneNumber(phoneNum);
			System.out.println("사용자의 e-mail주소를 입력하세요");
			String email = sc.next();
			map.get(id).setEmail(email);
			System.out.println("사용자의 point를 입력하세요.");
			int point = sc.nextInt();
			map.get(id).setPoint(point);
		}
		
		System.out.println("검색할 id를 입력하세요.");
		int inputId = sc.nextInt();
		for(int i = 0; i < map.size(); i++) {
			//map.put(id, new User(name, age));
			if(map.containsKey(inputId)) {
				System.out.println("=====id : "+inputId+"=====");
				map.get(inputId).getAllInfo();
			}
		}
		
		//4. map에 들어있는 모든 내용을 출력하는 프로그램을 만드시오.
		
		  Iterator<Integer> mapIter = map.keySet().iterator();
		  
		  while(mapIter.hasNext()) {
			  Integer next = mapIter.next();
			  System.out.println("[id] : "+next.intValue()+" \n[정보]");
			  map.get(next).getAllInfo();
		  }
		  
		  //다른 방법(1) : 키를 이용한 전체 조회
		  Set<Integer> keys = map.keySet();
		  for(Integer key : keys) {
			  System.out.println(map.get(key));
		  }
		  
		  
		  //다른 방법(2) : 엔트리를 이용한 전체 조회 (key와 value의 묶음인 entry라는 객체를 사용)
		  Set<Entry<Integer, User>> entrySet = map.entrySet();
		  for(Entry<Integer, User> entry : entrySet) {
			  System.out.println("키 : "+entry.getKey());
			  System.out.println("키 : "+entry.getValue());
			  
		  }
		
		
		sc.close();
	}
}
