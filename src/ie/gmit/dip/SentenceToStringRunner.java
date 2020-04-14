package ie.gmit.dip;
/**
 * 
 * @author Fabrice Williams
 * This class is called 'SentenceToStringRunner' and runs the entire application by asking the user to input the words to be replaced
 * 
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
* The SentenceToStringRunner class turns a sentence into strings
* 
*/

public class SentenceToStringRunner {

	public String wordToSearchFor;
	private String myString;
	public String findthisword;
	private static String[] splitdone;
	public static String splitto;
	//public static String ss;

	/**
	* The getUserInput  method turns a sentence into strings
	* @param Method takes no parameter
	*/

		public void getUserInput () {
		//Step 1: enter text or sentence to be replaced
		}
		/**
		* The getinputTransformed method turns a sentence into strings
		* @param Method takes a String as parameter
		 * @return 
		*/
		
	public void inputTransformed() throws IOException {
		Scanner keyboard = new Scanner(System.in);
    		myString = keyboard.nextLine(); //word i key in
    		
		    keyboard.close(); //closing scannner
		    String[] str = myString.split("\\s+");
		    for (String ss : str) {
			    System.out.println(ss);
		    		splitto=ss;
		    		ThesaurusToGoogleWords ThesaurusToGoogleWords= new ThesaurusToGoogleWords();
		    		ThesaurusToGoogleWords.CompareMapValues();
		    	}
		    }
	
	/**
	* The searchAndReplaceAllTerms  method turns a sentence into strings
	* @param Method takes no parameter
	 * @throws IOException 
	*/

	public void searchAndReplaceAllTerms  () throws IOException {
		//ParseThesaurus ParseThesaurus=new ParseThesaurus();
		List<String> wordreturned=ie.gmit.dip.ParseThesaurus.replacedWordList;
		for(String temp: wordreturned) {
            //System.out.println(wordreturned.toString());
        
		System.out.print(temp+" ");
				}
		}
}