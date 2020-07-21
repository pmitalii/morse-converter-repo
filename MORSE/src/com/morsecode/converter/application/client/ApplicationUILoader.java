package com.morsecode.converter.application.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.morsecode.converter.application.bo.MorseConverterBO;
import com.morsecode.converter.application.bo.impl.MorseConverterBOImpl;

/**
 * @author Mitali 
 * 
 * This class is used to provide input 
 * to convert morse code to english and
 * vice a versa through swing client.
 *
 */
public class ApplicationUILoader implements ActionListener {

	private MorseConverterBO converterHelper;  
	private JLabel l1, l2, l3;
	private JTextField tf1, tf2;
	private JButton b1;

	/**
	 * Initializes applications Swing UI
	 * 
	 */
	public ApplicationUILoader() {
		converterHelper = new MorseConverterBOImpl();
		loadApplicationUI();
	}

	/**
	 * This method is to load the swing UI
	 * of this application
	 * 
	 */
	public void loadApplicationUI() {
		JFrame f = new JFrame("Morse Code Translater");

		l3 = new JLabel("INTERNATIONAL MORSE CODE CONVERTER");
		l3.setBounds(60, -20, 200, 90);

		l1 = new JLabel("INPUT :");
		l1.setBounds(50, 40, 100, 25);
		tf1 = new JTextField();
		tf1.setBounds(50, 70, 200, 30);

		l2 = new JLabel("OUTPUT :");
		l2.setBounds(50, 120, 100, 25);
		tf2 = new JTextField();
		tf2.setBounds(50,150,200,30);
		tf2.setEditable(false);

		b1 = new JButton("Convert");
		b1.setBounds(50,200,100,50);

		b1.addActionListener(this);

		f.add(l3);
		f.add(l1);
		f.add(l2);
		f.add(tf1);
		f.add(tf2);
		f.add(b1);


		f.setSize(300,300);

		f.setLayout(null);
		f.setVisible(true);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {

		String result = "";
		String message = tf1.getText();

		message= message.toLowerCase();

		if(e.getSource() == b1) {

			if (message.contains(".") || message.contains("-")) {
				String translate = converterHelper.toEng(message);
				result = String.valueOf(translate);
				tf2.setText(result);

			} else {
				String translate = converterHelper.toMcode(message);
				result = String.valueOf(translate);
				tf2.setText(result);
			}
		}

	}


}
