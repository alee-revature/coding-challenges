/*
 * Java: The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: 
 * 	A <=> Z; B <=> Y; C <=> X; etc.
	Create a function that takes a string and applies the Atbash cipher to it.

	Examples
	atbash("apple") --> "zkkov"
	atbash("Hello world!") --> "Svool dliow!"
	atbash("Christmas is the 25th of December") --> "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"

	Notes: Capitalisation should be retained.
	Non-alphabetic characters should not be altered.
 */

import java.util.HashMap;

public class AtbashCipher {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String[] alphabetArr = alphabet.split("", 26);
		
        for(String a: alphabetArr) {
        	System.out.println(a);
        }
        atbash("apple");
		
	}
	public static void atbash(String phrase) {
		
		String[] newWord = phrase.split("", newWord.length);
		
		for(String character: newWord) {
        	System.out.println(character);
        }
		
		String result = phrase;
		
		//match each letter to the opposite side of alphabet
		
		//a->z: a is first letter of alphabet at index 0
		//z is index 25
		
		System.out.println(result);
	}

}