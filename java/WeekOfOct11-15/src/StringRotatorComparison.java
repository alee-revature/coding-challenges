/*
 * Accept two given String and check if they are the rotation of each. 
 * If they then return true otherwise return false. 
 * A String is said to be a rotation of other string if they contain same characters and the sequence is rotated across any character, 
 * e.g. "dabc" is a rotation of "abcd" but "dbac" is not.
 */
import java.util.Comparator;
import java.util.Scanner;

public class StringRotatorComparison {
    public static void main(String[] args) {
    	
    	String test = "abcd";
    	String rotatedString = "dabc";
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter a string: ");
    	String str1 = input.nextLine();

    	System.out.println("Enter another string: ");
    	String str2 = input.nextLine();
        
        String str3 = str1 + str2;
        if (str3.contains(str2)) {
        	System.out.println("Is rotation");
        }
        else {
        	System.out.println("Not rotation");
        }
        
       
    }
//    Comparator<String> compareStringForRotation = new Comparator<String>() {
//		@Override
//		public int compare(String o1, String o2) {
//			//Comparator or comparable
//	        //if str1.equals(str2)
//			
//			return 0;
//		}
//    };
}
