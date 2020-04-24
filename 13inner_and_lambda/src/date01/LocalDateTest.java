package date01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTest {
	public static void main(String[] args) {
		/*
		 * 오늘날 권장하는 날짜표현 클래스
		 * 객체가 불변해 날짜가 변하는 것을 방지.
		 */
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear()+"년"); 
		System.out.println(today.getMonth()+"월"); //영어로 표현되는 '월'
		System.out.println(today.getMonthValue()); //숫자로 표현되는 '월'
		System.out.println(today.getDayOfMonth()+"일"); //일자
		System.out.println(today.getDayOfWeek()); //요일
		
		System.out.println(today.getDayOfYear()); //올해의 몇번째 날인지
		System.out.println(today.isLeapYear());//윤년 판단
		
		//시, 분, 초
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime); //시:분:초. 나노초
		System.out.println(currentTime.getHour()+"시");
		System.out.println(currentTime.getMinute()+"분");
		System.out.println(currentTime.getSecond()+"초");
		System.out.println(currentTime.getNano()); //나노초
		
		//년월일 시분초
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		System.out.print(currentDateTime.getYear()+"년 ");
//		System.out.println(currentDateTime.getMonth()); //영어 달
		System.out.print(currentDateTime.getMonthValue()+"월 ");
		System.out.print(currentDateTime.getDayOfMonth()+"일 ");
		System.out.println(currentDateTime.getDayOfWeek()); //요일
		System.out.print(currentDateTime.getHour()+"시 ");
		System.out.print(currentDateTime.getMinute()+"분 ");
		System.out.print(currentDateTime.getSecond()+"초 ");
		System.out.println(currentDateTime.getNano());
		
		
	}
}
