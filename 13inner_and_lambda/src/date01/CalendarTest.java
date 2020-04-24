package date01;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		/*
		 * 날짜를 표현하는 클래스
		 * 객체를 new 키워드를 직접 사용하지 않고 메소드를 통해 새로운 객체를 받음
		 * 보통은 이러한 방식으로 새로운 객체를 만들 수 없으나, calendar는 내부적으로 새로운 객체 생성
		 * 
		 */
		
		Calendar cal = Calendar.getInstance();
//		Calendar cal2 = new Calendar(); Calendar는 new를 통해 객체 생성 불가(오류 발생)
		
		/*
		 * 년월일, 시분초, 요일 등등을 관리할 수 있다.
		 * Calendar는 월표기를 0~11로 함(따라서 +1해서 표현해야 함)
		 */
		int year = cal.get(cal.YEAR); //년을 받을때
		int month = cal.get(cal.MONTH); //3월로 나오는 이유? '월'의 특징
		int day = cal.get(cal.DAY_OF_MONTH);
		
		System.out.println(year+"년 "+(month+1)+"월 "+day+"일");
		
		int hour = cal.get(cal.HOUR);
		int minute = cal.get(cal.MINUTE);
		int second = cal.get(cal.SECOND);
		int milliSecond = cal.get(cal.MILLISECOND);
		
		System.out.println(hour+"시 "+minute+"분 "+second+"초 "+milliSecond);
		
		int am_pm = cal.get(cal.AM_PM);
		System.out.println("am : "+cal.AM+", pm : "+cal.PM);
		System.out.println(am_pm); //am : 0, pm : 1
		if(am_pm == cal.AM) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		
		int whatDay = cal.get(Calendar.DAY_OF_WEEK);
//		DAY_OF_WEEK : 오늘이 이번주의 몇번째 날인지 구하는 메소드(일요일이 1)
//		DAY_OF_WEEK_IN_MONTH : 이번 달의 몇번째 요일인지 구하는 메소드
		switch(whatDay) {
		case 1: //case Calendar.SUNDAY;
			System.out.println("일요일");
			break;
		case 2: //case Calendar.MONDAY;
			System.out.println("월요일");
			break;
		case 3: //case Calendar.TUESDAY;
			System.out.println("화요일");
			break;
		case 4: //case Calendar.WEDNESDAY;
			System.out.println("수요일");
			break;
		case 5: //case Calendar.THURSDAY;
			System.out.println("목요일");
			break;
		case 6: //case Calendar.FRIDAY;
			System.out.println("금요일");
			break;
		case 7: //case Calendar.SATURDAY;
			System.out.println("토요일");
			break;
			
		}
		
		System.out.println(cal.get(cal.DAY_OF_WEEK_IN_MONTH));
	}
}
