package currencyConverterMVC;

import java.text.DecimalFormat;

/**
 * Model for currency converter. Holds a value in GB pounds and the exchange rates for different 
 * currencies. Allows the GBP amount to be set and retrieved in different currencies.
 * 
 * @author jbwatson
 *
 */
public class CurrencyConverterModel extends java.util.Observable {

	// Amount in GB pounds - initialised to £0.00
	private double sterling = 0;
	
	// Exchange rates
	private static final double USDtoGBP_Rate = 1.5689;
	private static final double EuroToGBP_Rate = 1.3723;

	/**
	 * Simply returns GB pound amount
	 * 
	 * @return		-	double, rounded to 2DP representing GB pound field
	 */
	public double getSterling() {
		return roundTo2DP(sterling);
	}

	/**
	 * Converts GB Pound field to US Dollars
	 * 
	 * @return		-	double, rounded to 2DP representing GB pound field as US Dollars
	 */
	public double getUSDollars() {
		return roundTo2DP( sterling * USDtoGBP_Rate );
	}

	/**
	 * Converts GB Pound field to Euros
	 * 
	 * @return		-	double, rounded to 2DP representing GB pound field as Euros
	 */
	public double getEuros() {
		return roundTo2DP( sterling * EuroToGBP_Rate );
	}

	
	/**
	 * Sets the GB Pound Sterling amount and notifies observers.
	 * 
	 * @param sterling		-	double representing new sterling amount
	 */
	public void setSterling(double sterling) {
		this.sterling = sterling;
		setChanged();
		notifyObservers();
	}

	/**
	 * Sets the GB Pound Sterling amount (after converting input) and notifies observers.
	 * 
	 * @param dollars		-	double representing new sterling amount in US Dollars
	 */
	public void setUSDollars(double dollars) {
		sterling = dollars / USDtoGBP_Rate;
		setChanged();
		notifyObservers();
	}

	/**
	 * Sets the GB Pound Sterling amount (after converting input) and notifies observers.
	 * 
	 * @param dollars		-	double representing new sterling amount in US Dollars
	 */
	public void setEuros(double euros) {
		sterling = euros / EuroToGBP_Rate;
		setChanged();
		notifyObservers();
	}

	/**
	 * Simply rounds a double to 2 decimal places (2DP)
	 * 
	 * @param d		-	double to round
	 * @return		-	double rounded to 2DP
	 */
	private double roundTo2DP(double d) {
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		return Double.valueOf(twoDForm.format(d));
	}

}
