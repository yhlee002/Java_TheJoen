package date01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTest01 {
	public static void main(String[] args) {
		/*날짜관련 클래스를 이용해서 날짜의 차이를 구한다.
		 * 원하는 날짜를 넣어서 객체를 생성.
		 */
		LocalDate targetDate = LocalDate.of(2000, 10, 9);
		System.out.println(targetDate);
		
		LocalTime targetTime = LocalTime.of(12, 10);
		System.out.println(targetTime);
		
		//2000-10-9부터 30일 뒤는?
		System.out.println(targetDate.plusDays(30));
		//30일 전은?
		System.out.println(targetDate.minusDays(30));
		//10달 뒤는?
		System.out.println(targetDate.plusMonths(10));
		
		//2020-10-20일에서 15주 뒤는?
		LocalDate targetDate2 = LocalDate.of(2020, 10, 20);
		System.out.println("15주 뒤 : "+targetDate2.plusWeeks(15));
		//20개월 전은?
		System.out.println("20개월 전 : "+targetDate2.minusMonths(20));
		//59일 뒤는?
		System.out.println("59일 뒤 : "+targetDate2.plusDays(59));
		//100일 뒤는?
		System.out.println("100일 뒤 : "+targetDate2.plusDays(100));
		
		//크리스마스까지는 며칠 남았는가?
		LocalDate christmas = LocalDate.of(2020, 12, 25);
		LocalDate currentDate = LocalDate.now();
		//기간을 관리하는 클래스
		Period p = Period.between(currentDate, christmas);
		System.out.println(p.getYears());
		System.out.println(p.getMonths()+"개월");
		System.out.println(p.getDays()+"일");
		
		//그러면 며칠? (남은 일 수)
		System.out.println(ChronoUnit.DAYS.between(currentDate, christmas));
		
		//내년 자기 생일이 며칠 남았는지
		LocalDate myBirth = LocalDate.of(2021, 2, 14);
		System.out.println(ChronoUnit.DAYS.between(currentDate, myBirth));
		//몇년 몇개월 남았는지 출력하기
		Period p2 = Period.between(currentDate, myBirth);
		System.out.println(p2.getYears()+"년 "+p2.getMonths()+"개월 "+p2.getDays()+"일");
	}
}
