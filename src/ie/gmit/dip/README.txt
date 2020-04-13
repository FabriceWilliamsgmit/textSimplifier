------------------------------------
Welcome to the Text Simplifier API Java program, Release 1.0.0
------------------------------------

Documentation
=============
In order to run the application, please run the steps below:

1- Download the zip archive to your local machine
2- Unzip the file and go to simplifier\src\ie\gmit\dip
3- Open your Windows or Mac Shell Console
4- Run the following command:
			Java -Xmx1G –cp ./simplifier.jar ie.gmit.dip.Runner
5- Enter the text to be simplified
6- Press Enter
7- Your simplified text will be returned

Main Features
=============

The program itself is comprised of the following java files:
- ParseThesaurus.java : This class parses the MobyThesaurus2.txt into a treemap. This will then be used in conjunction with another map (Google 1000 words) to create another map.
- ParseGoogleWords.java: This class parses the 1000 Google words into a Treemap. This will then be used to compare/associate the 1000 to the whole thesaurus.
- Runner.java: This class runs the whole application.
- ConsoleColour.java: This class is used to customise the actual Shell Console so that simplified words are returned in a different colour than the unchanged words.
- ThesaurusToGoogleWords.java: This class is used to compare the Google 1000 words with the thesaurus.
- SentenceToStringRunner.java: This class runs the search and replace functionality of the application. each word is compared to the key value (i.e. the 1000 words) and returns to the end user.




Created by Fabrice Williams on 06, January, 2020
Student number at GMIT: G00376395
Email: G00376395@gmit.ie
