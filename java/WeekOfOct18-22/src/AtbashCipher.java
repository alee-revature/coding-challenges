
public class AtbashCipher {

	public static void main(String[] args) {
		atbash("apple"); //zkkov
		atbash("Hello world!"); //"Svool dliow!"
//		atbash("Christmas is the 25th of December"); //"Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"
	}
	public static void atbash(String phrase) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String cipher = "zyxwvutsrqponmlkjihgfedcba";
		
		//charAt and indexOf
			//a is first letter of alphabet, and atbash would be z, index of 25
			for(int i = 0; i < phrase.length(); i++) {
				String result = phrase.replace(alphabet.charAt(i), cipher.charAt(i));
				phrase = result;
			}
			System.out.println(phrase);
			
			//find position of letter of alphabet
			
//			String result = phrase.replace('a','z');
//			phrase = result;
//			result = (phrase.replace('p', 'k'));
//			
//			phrase = result;
//			result = phrase.replace('l', 'o');
//			
//			phrase = result;
//			result = phrase.replace('e', 'v');
//			System.out.println(result);
	}
}