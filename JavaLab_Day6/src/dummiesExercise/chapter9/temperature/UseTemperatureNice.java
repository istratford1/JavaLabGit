package dummiesExercise.chapter9.temperature;

public class UseTemperatureNice {
	
	public static void main(String args[]) {
		/// 1st
		TemperatureNice temp = new TemperatureNice();
		temp.setNumber(70.0);
		temp.setScale(TempScale.FAHRENHEIT);
		temp.display();
		
		// 2nd
		temp = new TemperatureNice(32.0);
		temp.display();
		
		// 3rd
		temp = new TemperatureNice(TempScale.CELSIUS);
		temp.display();
		
		// 4th
		temp = new TemperatureNice(2.73,TempScale.KELVIN);
		temp.display();
	}

}
