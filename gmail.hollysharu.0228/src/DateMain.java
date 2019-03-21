import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		//현재 날짜 및 시간을 갖는 Date 인스턴스 생성하기 
		//Date today = new Date(); 
		//toString이 재정의 되어 있어서 바로 출력하면 저장된 데이터 확인가능 
		//System.out.printf("%s\n", today);
	
		
		//년월일을 직접 입력해서 생성 - Deprecated 
		//년도는 1900년 이후의 지나온 년도 월은 0부터 시작 - 1달 줄여서 적어야 함 
		Date birth = new Date(80, 7, 19);
		System.out.printf("%s\n", birth);
		
		
		//Calendar 생성하는 방법 2가지 
		Calendar now = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		System.out.printf("%s\n", now);
		System.out.printf("%s\n", cal);
		
		//특정한 날짜 및 시간 만들기
		//하나씩 설정하기 - 한꺼번에 설정하는 메소드도 존재 
		//GregorianCalendar의 생성자를 이용해서 한번에 생성 가능 
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.MONTH, 3);
		cal.set(Calendar.DAY_OF_MONTH, 17);
		cal.set(Calendar.HOUR, 13);
		
		//now에서 cal까지 지나온 날짜 수 계산 
		long gap = now.getTimeInMillis() - cal.getTimeInMillis();
		gap = gap / 1000 / 86400; //86400초=하루 
		System.out.printf("%d일이 지났습니다\n", gap);
		
		
	}
}
