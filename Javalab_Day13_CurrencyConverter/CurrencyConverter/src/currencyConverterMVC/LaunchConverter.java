package currencyConverterMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import currencyConverterMVC.dollarToPound.DollarToPoundControl;
import currencyConverterMVC.dollarToPound.DollarToPoundView;
import currencyConverterMVC.euroToPound.EuroToPoundControl;
import currencyConverterMVC.euroToPound.EuroToPoundView;
import currencyConverterMVC.mainMenu.MainMenu;

/**
 * Instantiates MainMenu and holds Listeners which launch relevant converter views, depending
 * upon the button that has been pressed on the MainMenu.
 * 
 * @author jbwatson
 * 
 */
public class LaunchConverter {
	
	private static final CurrencyConverterModel model = new CurrencyConverterModel();

	public static void main(String[] args) {

		launchMainMenu();
	}

	/**
	 * Launches MainMenu and adds Listeners to its buttons.
	 */
	private static void launchMainMenu() {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainMenu menu = MainMenu.getInstance();
				menu.addUSDToPoundListener(new USDToPoundListener());
				menu.addEuroToPoundListener(new EuroToPoundListener());
				menu.setVisible(true);
			}

		});
	}

	/**
	 * Launches DollarToPoundView and DollarToPoundControl. Called when relevant button is
	 * pressed on the main menu. 
	 */
	private static void launchDollarToPound() {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				// Connect a view
				DollarToPoundView view = DollarToPoundView.getInstance(model);
				view.setVisible(true);

				// Connect a control
				DollarToPoundControl control = new DollarToPoundControl(model, view);
			}
		});

	}

	/**
	 * Launches DollarToPoundView and DollarToPoundControl. Called when relevant button is
	 * pressed on the main menu. 
	 */
	private static void launchEuroToPound() {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				// Connect a view
				EuroToPoundView view = EuroToPoundView.getInstance(model);
				view.setVisible(true);

				// Connect a control
				EuroToPoundControl control = new EuroToPoundControl(model, view);
			}
		});

	}

	/**
	 * Listener that listens on main menu button. Launches the Eurs to pound view and control.
	 */
	private static class EuroToPoundListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			launchEuroToPound();
		}
	}
	
	/**
	 * Listener that listens on main menu button. Launches the US Dollar to pound view and control.
	 */
	private static class USDToPoundListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			launchDollarToPound();
		}
	}

}
