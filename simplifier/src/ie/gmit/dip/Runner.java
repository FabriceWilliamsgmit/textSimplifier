package ie.gmit.dip;

public class Runner {

	public static void main(String[] args) throws Exception {
		System.out.println(ConsoleColour.BLUE_BRIGHT);
		System.out.println("***************************************************");
		System.out.println("* GMIT - Dept. Computer Science & Applied Physics *");
		System.out.println("*                                                 *");
		System.out.println("*             Text Simplifier V0.1                *");
		System.out.println("*       (AKA Orwellian Language Compliance)       *");		
		System.out.println("*                                                 *");
		System.out.println("***************************************************");
		
		System.out.print("Enter Text>");
		System.out.print(ConsoleColour.BLACK_BOLD_BRIGHT);
		
		SentenceToStringRunner SentenceToStringRunner = new SentenceToStringRunner ();
		SentenceToStringRunner.getUserInput();
		SentenceToStringRunner.inputTransformed();
		SentenceToStringRunner.searchAndReplaceAllTerms ();
		
		System.out.println(ConsoleColour.RESET);
	}
}