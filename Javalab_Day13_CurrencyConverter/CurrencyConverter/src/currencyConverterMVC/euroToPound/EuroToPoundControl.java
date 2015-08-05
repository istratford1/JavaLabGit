package currencyConverterMVC.euroToPound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import currencyConverterMVC.CurrencyConverterModel;

/**
 * Control for Euro to pound conversion.
 * 
 * @author Ian Stratford
 *
 */
public class EuroToPoundControl {
	
	private CurrencyConverterModel m;
	private EuroToPoundView v;

	/** 
	 * Constructor for class. 
	 * 
	 * @param m		-	model for controller to act upon
	 * @param v		-	view for controller to respond to
	 */
	public EuroToPoundControl( CurrencyConverterModel m, EuroToPoundView v) {
		this.m = m;
		this.v = v;
		
		// Add listeners to buttons
		v.addButtonListener(new ConvertListener());
	}


	/**
	 * Called when convert button is pressed. Changes model which will then notify view.
	 * 
	 * @author jbwatson
	 *
	 */
	class ConvertListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			m.setUSDollars(v.getEnteredText());			
		}	
	}
	
}
