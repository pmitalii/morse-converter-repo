package com.morsecode.converter.application.bo.impl;

import com.morsecode.converter.application.bo.MorseConverterBO;

/**
 * @author Mitali
 *
 * This class is used to convert morse code to english and
 * vice a versa through swing client.
 * 
 */
public class MorseConverterBOImpl implements MorseConverterBO {
	
	/* (non-Javadoc)
	 * @see com.morsecodeconverterwithinterface.MorseConverterBO#toMcode(java.lang.String)
	 */
	@Override
	public String toMcode(String message) {

		for(int i=0; i < morseDashDot.length; i++) {
			message = message.replace(morseAlphabets[i], morseDashDot[i]);
		}
		message = message.trim();
		System.out.println(message);
		return message;

	}
	
	/* (non-Javadoc)
	 * @see com.morsecodeconverterwithinterface.MorseConverterBO#toEng(java.lang.String)
	 */
	@Override
	public String toEng(String message) {
		
		for(int i=0; i < engDashDot.length; i++) {
			message=message.replace(engDashDot[i], englishAlphabets[i]);
		}
		System.out.println(message);
		return message;
	}

}
