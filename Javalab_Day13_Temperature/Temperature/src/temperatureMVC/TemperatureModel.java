package temperatureMVC;

import java.lang.Math.*;
/**
 * Holds a temperature in Fahrenheit but can convert it into Celsius
 * 
 * @author jbwatson
 *
 */
public class TemperatureModel extends java.util.Observable {

	private double temperatureF = 32.0;

	/**
	 * Returns temperature in fahrenheit
	 * 
	 * @return		-	temperature
	 */
	public double getF() {
		return temperatureF;
	}

	/**
	 * Converts temperature to celsius and rounds it to the nearest whole number (for display
	 * purposes)
	 * 
	 * @return		-	temperature in celsius
	 */
	public double getC() {
		return (double) Math.round((temperatureF - 32.0) * 5.0 / 9.0);
	}

	/**
	 * Sets temperature to input and notifies observers
	 * 
	 * @param tempF		-	new temperature
	 */
	public void setF(double tempF) {
		temperatureF = tempF;
		setChanged();
		notifyObservers();
	}

	/**
	 * Converts input to fahrenheit and sets temperature. Also notifies observers
	 * 
	 * @param tempC		-	new temperature in celsius
	 */
	public void setC(double tempC) {
		temperatureF = tempC * 9.0 / 5.0 + 32.0;
		setChanged();
		notifyObservers();
	}

}
