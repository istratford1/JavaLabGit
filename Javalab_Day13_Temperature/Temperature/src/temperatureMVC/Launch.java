package temperatureMVC;

import javax.swing.SwingUtilities;

import temperatureMVC.celsiusSpecific.CelsiusControl;
import temperatureMVC.celsiusSpecific.CelsiusView;
import temperatureMVC.fahrenheitSpecific.FahrenheitControl;
import temperatureMVC.fahrenheitSpecific.FahrenheitView;


/**
 * Instantiates Model View Control to display the GUI
 * 
 * @author jbwatson
 *
 */
public class Launch {

	public static void main(String[] args) {
		
		String arg;
		try{
			arg = args[0];
			if( arg.equals("celsius") )
				launchCelsius();
			if( arg.equals("fahrenheit") )
				launchFahrenheit();
		}
		catch( IndexOutOfBoundsException e ){
			System.out.println( "No arguements passed to main!");
		}				
	}

	/**
	 * Launches celsius version of the GUI
	 * 
	 */
	private static void launchCelsius() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Build the model
				TemperatureModel model = new TemperatureModel();

				// Connect a view
				CelsiusView view = CelsiusView.getInstance(model);
				view.setVisible(true);

				// Connect a control
				CelsiusControl control = new CelsiusControl(model, view);
			}
		});

	}

	/**
	 * Launches the fahrenheit version of the GUI
	 * 
	 */
	private static void launchFahrenheit() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Build the model
				TemperatureModel model = new TemperatureModel();

				// Connect a view
				FahrenheitView view = FahrenheitView.getInstance(model);
				view.setVisible(true);

				// Connect a control
				FahrenheitControl control = new FahrenheitControl(model, view);
			}
		});		
	}

	

}
