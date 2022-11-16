package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IsoDateExample {
	public static void main(String[] args) {
		DateTimeFormatter Iso_Date_formater=DateTimeFormatter.ISO_DATE;
		System.out.println("Iso-Date: "+Iso_Date_formater.format(LocalDate.now()));
		
		DateTimeFormatter Iso_Date_Time_formatter=DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("iso_date_time: "+Iso_Date_Time_formatter.format(LocalDateTime.now()));
	}
}
