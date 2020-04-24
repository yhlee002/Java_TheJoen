package string01;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		//문자열을 관리하는 String 클래스.
		String str = "안녕하세요.";
		//필요한 문자를 가져오거나, 잘라내거나, 나누거나 해야하는 경우가 있다.
		//String은 해당되는 위치의 char를 가져오는 메소드
		String str1 = "abcdef";
		//c의 위치는?
		System.out.println(str.charAt(2));
		//해당되는 문자(c)가 시작되는 위치는?
		System.out.println(str1.indexOf("c")); //c가 시작되는 위치
		System.out.println(str1.indexOf("def")); //def가 시작되는 위치
		//사용자로부터 영어 단어를 입력받아서 첫글자는 대문자, 나머지 글자는 소문자로 변경하여 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 단어를 입력하세요.");
		String strEng = sc.next();
		char[] arr = new char[50];
		for(int i = 0; i < strEng.length(); i++) {
			arr[i] = strEng.charAt(i);
		}
		
		//문자열 자르기(subString(시작위치, 끝나는 위치)
		System.out.printf("%1s%s", strEng.substring(0, 1).toUpperCase(), strEng.substring(1).toLowerCase());
		System.out.println();
		//선생님 방법(1)
		char[] sArr = strEng.toCharArray();
		for(int i = 0; i < sArr.length; i++) {
			if(i == 0) {
				System.out.print((sArr[i] >= 'a' && sArr[i] <= 'z') ? (char)(sArr[i] - 32) : sArr[i]);
			}else {
				System.out.print(!(sArr[i] >= 'a' && sArr[i] <= 'z') ? (char)(sArr[i] - 32) : sArr[i]);
			}
		}
		System.out.println();
		
		//선생님 방법(2)
		System.out.println("-----------------");
		String lower = strEng.toLowerCase();
		String first = strEng.toUpperCase().charAt(0)+"";
		System.out.println();
		for(int i = 0; i < sArr.length; i++) {
			if(i == 0) {
				System.out.print(first);
			}else {
				System.out.print(lower.charAt(i));
			}
		}
		//ln43-49을 이렇게 대체 가능
//		String rs = lower.substring(1);
//		System.out.println(first+rs);
		
		String str2 = "abcdefgabcdefg";
		str2.indexOf("a", 1); //index 1 부터 확인을 시작함
		
		System.out.println("z를 찾자 : "+str2.indexOf("z")); //없는 문자(열)을 찾을 경우 -1을 리턴
		System.out.println("str2.lastIndexOf(\"a\") : "+str2.lastIndexOf("a"));
		
		sc.close();
	}
}
