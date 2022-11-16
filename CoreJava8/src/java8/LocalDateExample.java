package java8;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
	public static void main(String[] args) {
		System.out.println("Create own/custom LocalDate");
		
		LocalDate createOwnDate=LocalDate.of(2022, Month.NOVEMBER, 12);
		System.out.println("createownDate = "+createOwnDate);
		
		LocalDate createowndate = LocalDate.of(2022, 11, 10);
		System.out.println("createoendate="+createowndate);
		
		String dateString="2022-12-14";
		LocalDate createowndate1=LocalDate.parse(dateString);
		System.out.println("Createowndate1="+createowndate1);
	}
}
