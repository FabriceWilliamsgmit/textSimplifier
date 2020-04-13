package ie.gmit.dip;

/**
 * 
 * @author Fabrice Williams
 * This class is called 'ParseThesaurus' and creates a map of the thesaurus file used to compare words with the
 * 1000 Gooogle words
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.Set;

public class ParseThesaurus {
//Adding instance variables here
		
	    public TreeMap<String, List> tMap = new TreeMap<>();
		 List <List<String>> mappedList= new ArrayList<>();
		 public HashMap<String,List<String>> GoogleToThesarus= new HashMap<>();
		 public String returnedValue;
 		public Set<String> wordReturned = new HashSet<String>(); 
		//public static String wordreturned;
		 public static List<String> replacedWordList = new ArrayList<>();
		 SentenceToStringRunner SentenceToStringRunner=new SentenceToStringRunner();
	    	String splitto=ie.gmit.dip.SentenceToStringRunner.splitto;
		 /**
		  * <p>We create a method called parseThesaurus which aims at parsing the Moby Thesaurus into a treemap</p>
		  * @param No parameter required
		  * @return Does not return anything
		  * @see 
		  * @throws Will throw a normal exception
		  * @since 1.0
		  */
		public void parseThesaurus() throws IOException {
			//We create an object below to read the thesaurus file
			FileInputStream fis = new FileInputStream("src//ie//gmit//dip//resources//MobyThesaurus3.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(fis));
			 List <List<String>> listOflist= new ArrayList<>();
			// HashMap<String,List> tMap = new HashMap<>();		
			 List <String> individualListOfSynonyms= new ArrayList <String>();

			 
			 //we create a hashmap with the first word being the key value and the rest a list of synonims we will use
			while(br.readLine()!=null) {
				
				//read input from keyboard
				String somestring = br.readLine();
				//split keyboard input into a list of string. 
				//A string is separated by a comma, needs to be space
				String[] testsplit= somestring.split(",");
				//Put string into a list
				individualListOfSynonyms=Arrays.asList(testsplit);
				//Get very first word of list
				String indexvalue=individualListOfSynonyms.get(0).toString();
				//put this first word as the index into a new map
			    tMap.put(indexvalue, individualListOfSynonyms);
			    //br.close();
			   //System.out.println(tMap);
			    }
			}
		
				 /**
		  * <p>The getThesaurusMap method is another method to allow another class to access the map</p>
		  * @param Requires a String parameter
		  * @return It returns a String
		  * @since 1.0
		  */
		
		public void getThesaurusMap (String wordTofind) {
	    	for (Entry<String, List> entry : tMap.entrySet()) {
	    		List singleListofSynonims = entry.getValue();
	    		if (singleListofSynonims.contains(wordTofind)){
	    			
	    			mappedList.add(singleListofSynonims);
	    			GoogleToThesarus.put(wordTofind,singleListofSynonims);
	    		}
	    		else {
	    			//System.out.println("value not in map");
	    	}
	    	}
	    }
				 /**
		 * <p>The replaceThesarusWordwithGoogleWord method is //iterate over each list inside the hashmap to verify whether a word exists and replace it with a google word</p>
		 * @param Requires a String parameter
				 * @return It returns a String
		 * @since 1.0
		 */
	    
	    public void replaceThesarusWordwithGoogleWord ( ) {
	    		    	
	    	for (Map.Entry<String, List<String>> entry : GoogleToThesarus.entrySet()) {
	    		//get key of map
	    		String key = entry.getKey();
	            //get value of map
	    		List<String> values = entry.getValue();
	            //String wordIsReplaced=null;
	        
	    	
	            
	            for (String temp: values) {
	            	
	                   	
	            	if (splitto.equals(temp)) {
	            		splitto=key;
	            		if(!replacedWordList.contains(splitto))
	            			replacedWordList.add(splitto);
            		
	              	            		         		}
	            	else {
	            	//wordIsReplaced=splitto;
	            		//System.out.println("failed");
	            	}
	            		    }
	    	}
	    }
	    }