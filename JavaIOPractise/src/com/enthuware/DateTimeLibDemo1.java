package com.enthuware;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.util.ArrayList;

public class DateTimeLibDemo1 {

	public static void main(String[] args) {

		System.out.println("/***********Now lets look at LocalDate************/\n");
		LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 29);
		System.out.println(date1);// 2016-11-29
		LocalDate date2 = LocalDate.of(2016, 11, 29);
		LocalDate d3 = date2;
		System.out.println("its new date " + d3);
		// using array list to store multiple dates
		ArrayList<LocalDate> dates = new ArrayList<LocalDate>(); // list to
																// store
																	// dates
		dates.add(date1);
		dates.add(date2);
		System.out.println(dates);// [2016-11-29, 2016-11-29]
		LocalDateTime dt1 = LocalDateTime.of(2016, 11, 29, 3, 18);// 2016-11-29T03:18:29.000000011
		System.out.println(dt1);
		LocalDate dx = LocalDate.of(2014, 0b101, 027);
		System.out.println(dx);

		System.out.println("********here*********");

		LocalTime tx1 = LocalTime.of(5, 6);
		LocalDate dx1 = LocalDate.of(2014, 1, 31).plusMonths(1);
		System.out.println("the date is "+dx1);
		LocalDateTime dtx1 = LocalDateTime.of(dx1, tx1);
		System.out.println(dtx1);// 2017-06-02T05:06

		dtx1 = dtx1.minusDays(1);
		System.out.println(dtx1);// 2017-06-01T05:06

		dtx1 = dtx1.minusHours(5);
		System.out.println(dtx1);// 2017-06-01T00:06

		dtx1 = dtx1.minusSeconds(40); // here 60 sec - given 40 sec = 20 seconds
		System.out.println(dtx1);// 2017-06-01T00:05:20

		dtx1.plusSeconds(1);
		System.out.println(dtx1);// 2017-06-01T00:05:21

		dtx1 = dtx1.plusHours(10);
		System.out.println(dtx1);// 2017-06-01T10:05:21

		dtx1 = dtx1.plusWeeks(7);
		System.out.println(dtx1);// 2017-07-20T10:05:21

		dtx1 = dtx1.plusMinutes(15);
		System.out.println(dtx1);// 2017-07-20T10:20:21
		LocalTime time1 = LocalTime.of(3, 4); // HR:Min
		System.out.println(date2 + "\n" + time1);
		LocalDateTime dateTime1 = LocalDateTime.of(date2, time1).minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dateTime1);
		System.out.println(LocalDateTime.of(date2, time1).minusDays(1).minusHours(10).minusSeconds(30));

		System.out.println("**********************Period class ****************");
		Period for4Months = Period.ofYears(5).ofMonths(4); // chaining in period
															// class dont work
															// .. here
															// ofYears(1) is
															// ignored and only
															// last call
															// considered
		System.out.println(for4Months); // P4M
		LocalTime t1 = LocalTime.of(3, 4);
		LocalDate d1 = LocalDate.of(2017, 12, 01);
		LocalDateTime ddtt1 = LocalDateTime.of(d1, t1);
		System.out.println(ddtt1);
		ddtt1 = ddtt1.minus(for4Months);
		System.out.println(ddtt1);
		Period withP = Period.ofYears(10).withDays(10).withYears(5).withMonths(6).withMonths(1).ofYears(20).ofMonths(11); // P5Y1M10D
		System.out.println(withP.normalized());
		ddtt1 = ddtt1.plus(withP);
		System.out.println(ddtt1);
		
		System.out.println("***** FINAL **************");
		LocalTime t11 = LocalTime.of(11, 22);
		LocalDate d11 = LocalDate.of(2014, 3, 3);
		
		LocalDateTime lldt=LocalDateTime.of(d11, t11);
		System.out.println(lldt);
		lldt=lldt.withDayOfMonth(12);
		System.out.println(lldt);
		System.out.println(lldt.getMonth());
		System.out.println(lldt.getDayOfMonth());
		LocalDate abcd=LocalDate.parse("2015-12-31");
		System.out.println(abcd);
	String stra=null;	
System.out.println(stra);

		Year y=Year.of(2015);
		LocalDate xx=y.atMonthDay(MonthDay.of(4, 30));
		System.out.println(xx);
	}

}

/**
 Period.ofXXXX(int) are static methods. chaining of static methods will result left most caller only.
 example:
 Period for4Months = Period.ofYears(5).ofMonths(4);  here only ofMonths will be considered
 
 Period.withxxx(int) instance methods.
 when we combaine with ofXXX(int) methods chaining will work.
 calling withXXX() methods with Period class will give compilation error.
 ex: Period.withxxx(3);...

some examples of chaining and their results:

Period withP = Period.ofYears(10).withDays(10).withYears(5).withMonths(6).withMonths(1); // P5Y1M10D

Period withP = Period.ofYears(10).withDays(10).withYears(5).withMonths(6).withMonths(1); //
 		Period withP = Period.ofYears(10).withDays(10).withYears(5).withMonths(6).withMonths(1).ofYears(20); //P 20Years

 if ofXXX() is at the end of the chaing then ignore all other calls to its right hand side and start evaualtion from there  to left side ..
 if any withXXX() are present to ofXXX() method then consider them else. ofXXX() is the final value
*/