package com.morsecode.converter.application;

import java.util.Scanner;

import com.morsecode.converter.application.bo.MorseConverterBO;
import com.morsecode.converter.application.bo.impl.MorseConverterBOImpl;

/**
 * @author Mitali 
 * 
 * This class is used to provide input 
 * to convert morse code to english and
 * vice a versa through console.
 *
 */
public class MorseCodeConsoleStarter {

	//add validations and make changes in this client as per the swing client 
	//on 22-july-2020
	
	//add sound into this application
	
	// modify this project to maven
	
	// convert to spring project and test with postman
	
	public static void main(String[] args) {

		MorseConverterBO obj1 = new MorseConverterBOImpl();

		System.out.println("Please Enter Your String To Convert : ");
		String message;
		Scanner sc = new Scanner(System.in);
		message = sc.nextLine();

		if(message.contains(".") || message.contains("-")) {
			obj1.toEnglishLanguage(message);
		}else {
			message = message.toLowerCase();
			obj1.toMorseCode(message);
		}
		sc.close();
	}

}
