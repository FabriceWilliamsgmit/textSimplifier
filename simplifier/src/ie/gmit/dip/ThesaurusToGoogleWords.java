package ie.gmit.dip;

/**
 * 
 * @author Fabrice Williams
 * This class is called 'ThesaurusToGoogleWords' and parses the words into single word to be replaced
 * 
 */


import java.util.Map.Entry;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;


		public class ThesaurusToGoogleWords{
			/**
			  * 
			  * 
			  * This method CompareMapValues compare user input with the Thesaurus to return a google word
			  *@param Takes a String parameter 
			  */
			 
	public void CompareMapValues() throws IOException {
		ParseGoogleWords ParseGoogleWords= new ParseGoogleWords();
		ParseGoogleWords.parseGoogleWords();
		ParseGoogleWords.get1000Map();
				
		ParseThesaurus ParseThesaurus= new ParseThesaurus();
		ParseThesaurus.parseThesaurus();
				
		//here i test that i can retrieve the 1000 words
		TreeMap<String, String> tMapGoogle =ParseGoogleWords.get1000Map();
			for (Entry<String, String> entryGoogle : tMapGoogle.entrySet()) {
		    String googlekey = entryGoogle.getKey();
		    String googlevalue = entryGoogle.getValue();
		    ParseThesaurus.getThesaurusMap(googlevalue);
		   
			ParseThesaurus.replaceThesarusWordwithGoogleWord();	    		
		}
	}
	}
