package temperatureMVC.celsiusSpecific;


import javax.swing.*;

import temperatureMVC.TemperatureModel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

/**
 * Uses TemperatureModel to display temperature in fahrenheit.
 * 
 * @author jbwatson
 *
 */
public class CelsiusView extends JFrame implements Observer {
	
	// Singleton instance
	private static CelsiusView instance;

	private static final long serialVersionUID = 1L;
	private TemperatureModel model;
	private JButton upButton, downButton;
	private JLabel temp;
	
	/**
	 * Singleton getInstance(). Ensures we only ever have one instance of the GUI
	 * 
	 * @param model		-	model needed to instantiate the view
	 */
	
	public static CelsiusView getInstance(){
		if(instance != null){
			// instance is already present, so use it
			return  instance;
		}else{
			// ok instance is not present, lets create a new one
			instance = new  CelsiusView();
			return instance;
		}
		
		
	}
	
	// private constructor as used in singleton
	private CelsiusView(){
		
		
		
	}
	
	
	public static CelsiusView getInstance( TemperatureModel model ){
		
		if( instance == null )
			instance = new CelsiusView(model);
		
		return instance;
	}

	/**
	 * Constructor called from getInstance()
	 * 
	 * @param model		-	A model is needed so that we can 
	 * 						observe it and respond to its changes
	 */
	private CelsiusView( TemperatureModel model) {
		
		// Set up fields
		this.model = model;		
		this.upButton = new JButton("Raise");
		this.downButton = new JButton("Lower");
		
		// Add an observer to the model
		model.addObserver(this);
		
		// Allows us to close the window
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		// Make the text to display
		// Edit this for CelsiusView
		temp = new JLabel( "Model Temperature in Celcius: " + model.getC(), SwingConstants.CENTER );
		this.add(temp);
		
		// Make the buttons
		Panel buttons = new Panel();
		buttons.add(upButton);
		buttons.add(downButton);		
		this.add("South", buttons);		
		
		this.setSize(400,100);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Adds listener to raise button so that it can react to a click. Called from 
	 * control
	 * 
	 * @param a		-	ActionListeners respond to mouse clicks
	 */
	public void addRaiseListener(ActionListener a){
		upButton.addActionListener(a);
	}
	
	/**
	 * Adds listener to lower button so that it can react to a click. Called from 
	 * control
	 * 
	 * @param a		-	ActionListeners respond to mouse clicks
	 */
	public void addLowerListener(ActionListener a){
		downButton.addActionListener(a);
	}

	/** 
	 * Called when model changes. Updates text to correct value
	 */
	@Override
	public void update(Observable o, Object arg) {

		temp.setText( "Model Temperature in Celciust: " + model.getF() );
		
	}
}
