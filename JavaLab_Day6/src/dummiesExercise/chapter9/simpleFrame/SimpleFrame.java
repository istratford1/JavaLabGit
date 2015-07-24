package dummiesExercise.chapter9.simpleFrame;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;

@SuppressWarnings("serial")

public class SimpleFrame extends JFrame {
	
	// default constructor
	public SimpleFrame() {
		setTitle("Don’t click the button!");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JButton("Panic"));
		setSize(300, 100);
		setVisible(true);

	}
}
