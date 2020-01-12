package ie.gmit.dip;

/**
 * 
 * @author Fabrice Williams
 * This class is called 'ParseGoogleWords' and parses the 1000 words Google file
 * 
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap; 

public class ParseGoogleWords {

	//Instance variables go here
	private FileInputStream fis = null;
	private TreeMap<String, String> tMap = new TreeMap<>();
    
    //method to allow another class to access the map
    public TreeMap<String, String> get1000Map() {
        return tMap;
   }
	 /**
	  * <p> This Method below is used to read Google 1000 words</p>
	  * @param No parameter required
	  * @return Does not return anything
	  * @see 
	  * @since 1.0
	  */

	//
	public void parseGoogleWords() {
		try {
		fis = new FileInputStream("src//ie//gmit//dip//resources//google-1000.txt");
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	}
		//We create an object below to read the file google-1000.txt
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        for (int i = 0; i < 1000; i++) {
        	String words = null;
			try {
				 words = br.readLine();
			} 
			catch (IOException e) {
				
				e.printStackTrace();
			}
            tMap.put(words, words);
        }
	}
	}