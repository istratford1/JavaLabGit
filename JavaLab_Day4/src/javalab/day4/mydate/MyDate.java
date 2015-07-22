package javalab.day4.mydate;
import java.util.GregorianCalendar;

public class MyDate {

	
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;

	// constructor
	public MyDate(int _year, int _month, int _day, int _hour, int _minute){
		
		year = _year;
		month = _month;
		day = _day;
		hour = _hour;
		minute = _minute;
		
		
		
	}
	
	// get date info as string
	public String getDate(){
		return day + "/" + month + "/" + year + " " + hour + ":" + minute;
		
		
		
	}

	
	// adds or removes minutes
	public void changeMinutes(int min){
			
		if (min + minute > 59){
			// reset minutes in hour
			minute = (min + minute) - 60;
			
			
			// add one to hours
			
			changeHours(1);
			
		} else {
		 
			minute = minute + min;
			
		}
			
			
	}
		
		
	// adds or removes hours
	public void changeHours(int h){
		
		if( h + hour > 23){
		    // reset hours
			hour = (h + hour) - 24;
				
			// add one to day
		   changeDays(1);
		} else {
			hour = hour + h;
			
		}
		
		
		
	}
	
	// adds or removes days
	public void changeDays(int d){
	   
		if (d + day > daysInMonth(month)){
			/// reset days
			day =  (day + d) - daysInMonth(month) ;
			
			// add one to month
			changeMonths(1);
			
		} else {
			day = day + d;	
				
		}
		
			
			
	}
		
	// adds or removes months
	public void changeMonths(int m){
				
		if (m + month > 12){
			// reset months
			month = (m + month) - 12;
			
			// add one to year
			changeYears(1);
			
		} else {
			
			month = month + m;
					
		}
		
				
				
	}
		
	// adds or removes years
	public void changeYears(int y){
					
		year = year + y;			
					
					
	}
	
	// returns days in month
	
	private int daysInMonth(int mon){
		int  numDays = 0;
	
		switch (mon){
			case 4:
			case 6:
			case 9:
			case 11:
				numDays = 30;
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDays = 31;
				break;
			case 2:
				numDays=  29;
				break;
				
		}
		
		return numDays;
		
	}
	
	
	/// quick way of calculating leap year ! 
	private boolean isLeapYear(int year) {
		 
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
		 
		return cal.isLeapYear(year);
	}
		 
	
	public String getLeapYear(){
		
		boolean leap = isLeapYear(year);
		if(leap){
			return year + " is a leap year";
			
		} else {
			return year + " is not a leap year";
					
		}
		
		
		
	}
	
	
}
