package currencyConverterMVC.euroToPound;

import javax.swing.*;

import currencyConverterMVC.CurrencyConverterModel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;


public class EuroToPoundView extends JFrame implements Observer {
	
	// Singleton instance
	private static EuroToPoundView instance;

	private static final long serialVersionUID = 1L;
	private CurrencyConverterModel model;
	private JLabel text, output;
	private TextField inputField;
	private JButton button;
	
	/**
	 * Singleton getInstance(). Ensures we only ever have one instance of the GUI.
	 */
	public static EuroToPoundView getInstance( CurrencyConverterModel model ){
		
		if( instance == null )
			instance = new EuroToPoundView(model);
		
		return instance;
	}

	/**
	 * Constructor called from getInstance()
	 */
	private EuroToPoundView( CurrencyConverterModel model) {
		
		this.setTitle("Euros to British Pound Converter");
		this.model = model;	
		model.addObserver(this);
		
		// Allows us to close the window
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		GridLayout layout = new GridLayout(0, 1);
		this.setLayout(layout);
		
		text = new JLabel( " Input amount in Euros:" );
		inputField = new TextField("0.00", 30);
		output = new JLabel( " Converted amount: £0.00" );
		button = new JButton("Convert");
		
		this.add(text);
		this.add(inputField);
		this.add(output);		
		this.add(button);		
		
		this.setSize(300,130);
		setLocationRelativeTo(null);
	}
	

	public void addButtonListener(ActionListener a){
		button.addActionListener(a);
	}

	/** 
	 * Called when model changes. Just updates text
	 */
	@Override
	public void update(Observable o, Object arg) {
		output.setText( " Converted amount: £" + model.getSterling() );		
	}
	
	public double getEnteredText(){
		return Double.parseDouble(inputField.getText());
	}

}