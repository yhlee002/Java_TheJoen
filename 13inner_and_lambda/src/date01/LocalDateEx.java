package date01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

public class LocalDateEx {
	public static void main(String[] args) throws IOException {
		//2020년 4월 21일 부터 2020년 9월 7일까지(종강일)
		LocalDate current = LocalDate.of(2020, 4,  20);
		LocalDate finalD = LocalDate.of(2020, 9, 7);
		
//		Period p = Period.between(current, finalD);
		//며칠남았는지 출력
		System.out.println("종강까지 남은 일 수 : "+ChronoUnit.DAYS.between(current, finalD));
		//몇 시간 남았는지 출력
		LocalDateTime currentTime = LocalDateTime.now();
		LocalDateTime finalDTime = LocalDateTime.of(2020, 9, 7, 0, 0, 0);
		System.out.println("종강까지 남은 시간 : "+ChronoUnit.HOURS.between(currentTime, finalDTime));
		//추석까지는 며칠남았는지 출력
		LocalDate Chuseok = LocalDate.of(2020, 10, 1);
		System.out.println("추석까지 남은 일 수 : "+ChronoUnit.DAYS.between(current, Chuseok));
		//2020년 4월 21일 부터 50일 이후 날짜와 요일 출력
		System.out.println("50일 이후 : "+current.plusDays(50)+", "+current.plusDays(50).getDayOfWeek()+"(요일)");
		//2020년 4월 21일 부터 100일 이후 날짜와 요일 출력
		System.out.println("100일 이후 : "+current.plusDays(100)+", "+current.plusDays(100).getDayOfWeek()+"(요일)");
		//2020년 4월 21일 부터 1000일 이후 날짜와 요일 출력
		System.out.println("1000일 이후 : "+current.plusDays(1000)+", "+current.plusDays(1000).getDayOfWeek()+"(요일)");
		
		//"2020-10-20"이렇게 값이 넘어오면 LocalDate으로바꿀 수는 없을까?(구분자로 나누어 각 블록을 LocalDate타입 변수에 넣는 LocalDate.of( , , )에 넣기
		//1)StringTokenizer사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("날짜를 0000-00-00의 형태로 입력하세요.");
		String date = br.readLine();
		StringTokenizer st = new StringTokenizer(date, "-");
		
		LocalDate date2 = LocalDate.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		System.out.println(date2);
		
		//2)배열에 넣어 split()사용
		String str = br.readLine();
		String[] date3 = str.split("-");
		int[] date3Int = new int[3];
		for(int i = 0; i < date3.length; i++) {
			date3Int[i] = Integer.parseInt(date3[i]);
		}
		LocalDate date4 = LocalDate.of(date3Int[0], date3Int[1], date3Int[2]);
		
		System.out.println(date4);
		br.close();
		
	}
	
}
