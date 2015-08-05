package temperatureMVC.fahrenheitSpecific;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import temperatureMVC.TemperatureModel;
import temperatureMVC.celsiusSpecific.CelsiusView;



/**
 * Holds instance of view and model so that it can react to changes in the view by changing 
 * the model
 * 
 * @author jbwatson
 *
 */
public class FahrenheitControl {
	
	private TemperatureModel m;
	private FahrenheitView v;

	public FahrenheitControl( TemperatureModel m, FahrenheitView v) {
		this.m = m;
		this.v = v;
		
		// Add listeners to buttons
		v.addRaiseListener(new RaiseListener());
		v.addLowerListener(new LowerListener());
	}

	/**
	 * Defines behaviour when raise button is pressed
	 * 
	 * @author jbwatson
	 *
	 */
	class RaiseListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			m.setF( m.getF() + 0.5 );			
		}	
	}
	
	/**
	 * Defines behaviour when lower button is pressed
	 * 
	 * @author jbwatson
	 *
	 */
	class LowerListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			m.setF( m.getF() - 0.5 );			
		}	
	}
	
}
