package java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateExample_DisplayNextdates {
	public static void main(String[] args) {
		LocalDate localDateToday=LocalDate.now();
		System.out.println("--Display next Dates--");
		
		LocalDate dateTomorrow=localDateToday.plusDays(1);
		System.out.println("dateTomorrow="+dateTomorrow);
		
		System.out.println("nextWeek="+localDateToday.plusWeeks(1));
		System.out.println("nextMonth="+localDateToday.plusMonths(1));
		System.out.println("nextYear="+localDateToday.plusYears(1));
		
		System.out.println("\n--Display next dates using java.time.temporal.ChronoUnit--");
		
		System.out.println("nextDay="+localDateToday.plus(1, ChronoUnit.DAYS));
		System.out.println("nextweek="+localDateToday.plus(1, ChronoUnit.WEEKS));
		System.out.println("nextMonth="+localDateToday.plus(1, ChronoUnit.MONTHS));
		System.out.println("nextYear="+localDateToday.plus(1, ChronoUnit.YEARS));
		System.out.println("nextcentury="+localDateToday.plus(1, ChronoUnit.CENTURIES));
	}
}
