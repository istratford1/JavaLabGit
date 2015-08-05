package temperatureMVC.celsiusSpecific;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import temperatureMVC.TemperatureModel;



/**
 * Holds instance of view and model so that it can react to changes in the view by changing 
 * the model
 * 
 * @author jbwatson
 *
 */
public class CelsiusControl {
	
	// Controls hold both a model and a view
	private TemperatureModel m;
	private CelsiusView v;

	/**
	 * Constructor for control
	 * 
	 * @param m		-	A model is needed so that the control pass on changes made in the view
	 * @param v		-	A view is needed so that the control can add listeners to respond to 
	 * 					user actions
	 */
	public CelsiusControl( TemperatureModel m, CelsiusView v) {
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
			m.setC( m.getC() + 1 );			
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
			m.setC( m.getC() - 1 );			
		}	
	}
	
}
