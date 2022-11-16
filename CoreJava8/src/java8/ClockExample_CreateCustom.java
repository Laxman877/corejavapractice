package java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClockExample_CreateCustom {
	public static void main(String[] args) {
		String str="2021-10-26 12:15";
		DateTimeFormatter dateTimeFormater=DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm");
		
		LocalDate localdate1=java.time.LocalDate.parse(str,dateTimeFormater);
		System.out.println("LocalDate1 = "+localdate1);
		
		String str2="22-01-2021 13:45";
		DateTimeFormatter dateTimeFormatter2=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm");
		LocalDate localdate2=LocalDate.parse(str2,dateTimeFormatter2);
		System.out.println("Locldate2="+localdate2);
		
		DateTimeFormatter dateTimeFormatter3=DateTimeFormatter.ofPattern("yyyy-mm-dd");
		LocalDate localDate3=LocalDate.of(2021, 01, 22);
		String formatString=localDate3.format(dateTimeFormatter3);
		System.out.println("formattedLocalDateInString = "+formatString);
	}
}
