package java8;

import java.time.LocalDate;

public class LocalDateExampleCustome {
	public static void main(String[] args) {
		LocalDate localdate=LocalDate.now();
		System.out.println("localdtaetoday "+localdate);
		System.out.println("Dayofmonth "+localdate.getDayOfMonth());
		System.out.println("Month "+localdate.getMonth());
		System.out.println("Year "+localdate.getYear());
		
		System.out.println("Era="+localdate.getEra());
		System.out.println("DayOfweek="+localdate.getDayOfWeek());
		System.out.println("Day Of year="+localdate.getDayOfYear());
	}
}
