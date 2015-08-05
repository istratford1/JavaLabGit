package currencyConverterMVC.mainMenu;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Class that displays the main menu. For any new converter views, a new JButton should
 * be added. The LaunchConverter class acts as the controller for this class so the
 * ActionListeners that call the relevant views are implemented there.
 *  
 * @author jbwatson
 *
 */
public class MainMenu extends JFrame {
	
	// Singleton instance
	private static MainMenu instance;
	
	// Governs window size - edit if adding more buttons
	private static final Dimension size = new Dimension(200, 100);

	private static final long serialVersionUID = 1L;
	private JLabel text;
	private JButton USDToPoundButton;
	private JButton EuroToPoundButton;
	
	/**
	 * Singleton getInstance(). Ensures we only ever have one instance of the GUI.
	 */
	public static MainMenu getInstance(){
		
		if( instance == null )
			instance = new MainMenu();
		
		return instance;
	}

	/**
	 * Constructor called from getInstance()
	 */
	public MainMenu() {
		
		this.setTitle("Currency Converter");
		GridLayout layout = new GridLayout(0, 1);
		this.setLayout(layout);
		
		// Allows us to close the window
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
				
		text = new JLabel( "What would you like to do?", JLabel.CENTER );
		USDToPoundButton = new JButton("Convert US Dollars to British Pounds");
		EuroToPoundButton = new JButton("Convert Euros to British Pounds");
		

		this.add(text);
		this.add(USDToPoundButton);
		this.add(EuroToPoundButton);
			
		this.setSize(size);
		setLocationRelativeTo(null);
	}
	

	/**
	 * Adds Listener to USD to pound button. Create a similar method for any new button.
	 * This will be called from LaunchConverter.
	 * 
	 * @param a		-	ActionListener implemented in LaunchConverter (launches view)
	 */
	public void addUSDToPoundListener(ActionListener a){
		USDToPoundButton.addActionListener(a);
	}
	
	public void addEuroToPoundListener(ActionListener a){
		EuroToPoundButton.addActionListener(a);
	}
	
}
