package java_chobo2.ch10;

import java.util.Calendar;
import java.util.Date;

public class DateToCalendarEx {

	public static void main(String[] args) {
		System.out.println("Clendar");
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(2000, 9,30);
		System.out.println(cal.get(Calendar.YEAR)+" "+(cal.get(Calendar.MONTH)+1)+" "+cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Date");
		Date d = new Date();
		d.setYear(19);
		d.setMonth(0);
		d.setDate(20);
		System.out.printf("%tF %n",d);
		
		convCalToDate(cal);
		convDateToCal(d);

	}

	private static void convCalToDate(Calendar cal) {
		System.out.println("convert Clendar To Date()");
		Date d = new Date(cal.getTimeInMillis());
		System.out.printf("%tF %n",d);
	}

	private static void convDateToCal(Date d) {
		System.out.println("convert Date To Clendar()");
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		System.out.println(cal.get(Calendar.YEAR)+" "+(cal.get(Calendar.MONTH)+1)+" "+cal.get(Calendar.DAY_OF_MONTH));
	}

}
