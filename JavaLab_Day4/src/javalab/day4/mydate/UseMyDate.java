package javalab.day4.mydate;


public class UseMyDate {
	/// class to demonstrate mydate class
	public static void main(String[] args){
	
	
		MyDate md = new MyDate(1970,12,31,23,54);
		/// show info on current date
		System.out.println(md.getDate());
		
		// now add to minutes...
		md.changeHours(2);
	 	md.changeMinutes(65);
		md.changeDays(4);
		
		
		/// show new date info
		System.out.println(md.getDate());
		System.out.println(md.getLeapYear());
		
		
		
		
	
}
}
