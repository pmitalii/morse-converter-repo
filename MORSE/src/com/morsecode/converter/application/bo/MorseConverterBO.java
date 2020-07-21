package com.morsecode.converter.application.bo;

/**
 * @author Mitali
 *
 */
public interface MorseConverterBO {
	
	String morseDashDot[] = { ".- ", "-... ", "-.-. ", "-.. ", ". ", "..-. ", "--. ", ".... ", ".. ", 
			".--- ", "-.- ", ".-.. ", "-- ", "-. ", "--- ", ".---. ", "--.- ", ".-. ",
			"... ", "- ", "..- ", "...- ", ".-- ", "-..- ", "-.-- ", "--.. "};
	
	String[] morseAlphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
			"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", 
			"y", "z"};
	
	String[] engDashDot = {"-...","-.-.","....","..-.",".---",".-..",".--.","--.-","...-","-..-",
			"-.--","--..","-..","--.","...","-.-","---",".-.","..-",".--",".-","..","--","-.",".","-"," ","  "};
	
	String[] englishAlphabets = { "b","c","h","f","j","l","p","q","v","x","y","z","d","g","s","k",
			"o","r","u","w","a","i","m","n","e","t",""," "};
	
	/**
	 * This method is to convert english
	 * word to morse code
	 * 
	 * @param message
	 * @return morse code message
	 */
	public String toMcode(String message);
	
	
	/**
	 * This method is to convert morse code
	 * into english words
	 * 
	 * @param message
	 * @return message in english 
	 */
	public String toEng(String message);

	
}
