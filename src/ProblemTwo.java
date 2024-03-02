/**
 * title: ProblemTwo.java
 * description: An application to convert user integer input into Farhenheit or Celsius values 
 * date: Sept 25, 2023
 * @author Phat V. Le
 * @version 1.00 Aug. 09, 2023 - Adding core code for ProblemTwo.java
 * @version 2.00 Sep. 25, 2023 - Adding documentation for ProblemTwo.java
 * @copyright 2023 Phat V. Le
 */

/**                                                                               
 *
 *<H1>Temperature Conversion Utility</H1>
 *
 *<H3>Purpose and Description</H3>
 *
 *<P>
 * An application that converts temperature from degrees Fahrenheit to degrees Celcius.
 *</P>
 *<P>
 * This program uses a Graphical User Interface (GUI) based on Frames to interact with the user.
 * The program includes a text field, and numerous labels to present the user interface.
 * User input is processed when the user presses the ENTER key while the focus is in the
 * input temperature text field.
 *</P>
 *<P>
 * This program uses the Java Swing API for GUI programming, and requires the
 * Sun Java SDK version 1.3 or better.
 *</P>
 *                                                                              
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming SDK 1.3 (or later) and the CLASSPATH are set up properly.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 *<DD> Compile:    javac GoodDocs.java</DD>
 *<DD> Run:        java GoodDocs</DD>
 *<DD> Document:   javadoc GoodDocs.java</DD>
 *</DL>
 */
/**
 *
 * <H3>Test Plan</H3>
 *
 *<P>
 * 1. Run the application.
 * EXPECTED:
 *		Program will begin and print out the following:
 *		This program converts Temperatures from Fahrenheit to Celsius and vice versa.
 *		Please enter your temperature: 
 *		
 *		After a number is entered the program will ask for:
 *		Please enter the unit (F/C):
 *		
 *		After a letter is entered then the program asks for:
 *		Do you wish to perform another conversion? (Y/N): 
 * ACTUAL:
 *    The above content displays as expected.
 *</P>
 * * * <H3> ProblemOne Variables</H3>
 *<P>
 *	stdin - creates the scanner type to accept user inputs
 *	ans - placeholder for user's answer to end the program's do-while loop
 *	not - string assigned "n" to be compared with user's answer in the do-while loop boolean requirement
 *	temperature - placeholder for the 1st question and is a double variable that assigns the user's answer after they entered a value
 *	tempType - placeholder for the 2nd question and is a string type that is used to determine whether
 *			   fahrenheit or celsius is used and is categorized accordingly to the if-statements
 *	ftype - used in a string boolean comparison with tempType where F or f is True
 *	ctype - used in a string boolean comparison with tempType where C or c is True
 *	tempValue - is a placeholder for the calculations used in either if-statement and used in the
 *				System.out.print() functions to produce celsius or fahrenheit values
 *				for the user
 *			
 *</P>
 *<P>
 * 2. Good data cases:
 * EXPECTED:
 *    Run the following test cases by typing the input value and pressing enter:
 * 	
 * 	Test 1:
 * 	Please enter your temperature: 123
 * 	Please enter the unit (F/C): C
 *
 * 	A temperature of 123.0 Celsius is equivalent to 253.40 degrees Fahrenheit.
 * 	Do you wish to perform another conversion? (Y/N): 
 *    
 * 	Test 2:
 * 	Please enter your temperature: 0.87
 * 	Please enter the unit (F/C): C
 * 
 * A temperature of 0.87 Celsius is equivalent to 33.57 degrees Fahrenheit.
 * Do you wish to perform another conversion? (Y/N): N
 *
 * Thank you. Goodbye.
 *
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 *<P>
 * 3. Bad data cases:
 * EXPECTED:
 * Test 1:
 * 	--------------------------------------------------------------------------------
 * 	If 1st input is not a number then the program will output an error 
 * 	--------------------------------------------------------------------------------
 * 
 * asdf -> 
 * 	Exception in thread "main" java.util.InputMismatchException
 *	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
 *	at java.base/java.util.Scanner.next(Scanner.java:1594)
 *	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
 *	at ProblemTwo.main(ProblemTwo.java:107)
 *	
 *	Test 2:
 *	--------------------------------------------------------------------------------
 *	If the 2nd value from the user is not a number or either the correct letters
 *	then the following should display below 
 *	--------------------------------------------------------------------------------
 *
 *	123, 123 -> 
 * 	Please enter your temperature: 123
 * 	Please enter the unit (F/C): 123
 * 	Do you wish to perform another conversion? (Y/N):
 * 
 *	123, asdf -> 
 * 	Please enter your temperature: 123
 * 	Please enter the unit (F/C): asdf
 * 	Do you wish to perform another conversion? (Y/N):
 * 
 * 	Test 3:
 *	--------------------------------------------------------------------------------
 *		If the 3rd value from the user is a number or either the incorrect letters
 *	then the following should display below 
 *	--------------------------------------------------------------------------------
 *
 *	123, c, asdf -> 
 * Please enter your temperature: 123
 * Please enter the unit (F/C): c
 * A temperature of 123.0 Celsius is equivalent to 253.40 degrees Fahrenheit.
 * Do you wish to perform another conversion? (Y/N): asdf
 * 
 * Please enter your temperature:
 *  
 * 123, c, 123 -> 
 * Please enter your temperature: 123
 * Please enter the unit (F/C): c
 * A temperature of 123.0 Celsius is equivalent to 253.40 degrees Fahrenheit.
 * Do you wish to perform another conversion? (Y/N): 123
 * 
 * Please enter your temperature:
 * 
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 */ 
//	Imported from the Java library
import java.util.Scanner;

/** primary (public) class for ProblemTwo */
public class ProblemTwo {

	/** This static void method is used to execute the program */
	public static void main(String[] args) {
		Scanner stdin = new Scanner ( System.in ); //Creates the scanner type for the 
		String ans = "";		//	Place holder for the user input
		String not = "n";		//	Boolean comparison for the user if they want to continue with more conversions
		double temperature;		//	User input placeholder that is a double type
		String tempType;		//	user input
		String ftype = "f";		//	String ftype used to compare the users input with the letter F for the user's 2nd input
		String ctype = "c";		//	String ctype used to compare the users input with the letter C for the user's 2nd input
		double tempValue = 0; 	//	Placeholder for the calculated value of either temperature Farhenheit or Celsius
		
		//	Prints out the message shown below of the purpose of this program
		System.out.println("This program converts Temperatures from Fahrenheit to Celsius and vice versa." ); // outputs a description of the program function
		do {
			
			System.out.print("Please enter your temperature: ");	//	Asks for user input of integer
			temperature = stdin.nextDouble();						//	Assigns user input into temperature variable	
			
			System.out.print("Please enter the unit (F/C): ");		//	Prints out a message asking for user input for initial conversion type
			tempType = stdin.next();								//	Initiates stdin scanner for user
		
				// This segment of code prints output of "A temperature of [temperature] Fahrenheit is equivalent to [tempValue] degrees Celsius."
				if (ftype.equalsIgnoreCase(tempType)) { 													//	Boolean comparison to compare user's input with correct string also ignores case sensitivity
					tempValue = ( temperature - 32 ) * 5 / 9;														//	Formula used to convert user's number to celsius 
					System.out.print("\nA temperature of " + temperature + " Fahrenheit is equivalent to " ); 	//	Prints out a message for user to display the value chosen from the user in fahrenheit and																							//	shows the converted value at the end of the sentence
					System.out.printf("%1.2f", tempValue);														//	Prints out the converted value of celsius and formats it to be 2 decimal places
					System.out.print(" degrees Celsius."  );													//	Prints out the ending words for the sentence 
				}
				// This segment of code prints output of "A temperature of [temperature] Celsius is equivalent to [tempValue] degrees Fahrenheit."
				if (ctype.equalsIgnoreCase(tempType)) { 													//	Boolean comparison to compare user's input with correct string also ignores case sensitivity
					tempValue = ( temperature * 9 / 5 ) + 32;													//	Formula used to convert user's number to farhenheit
					System.out.print("\nA temperature of " + temperature + " Celsius is equivalent to " ); 		//	Prints out a message for user to display the value chosen from the user in fahrenheit and
					System.out.printf("%1.2f", tempValue); 														//	shows the converted value at the end of the sentence
					System.out.print(" degrees Fahrenheit."  );													//	Prints out the converted value of fahenheit and formates it to be 2 decimal places
				}																							
			
			System.out.print("\nDo you wish to perform another conversion? (Y/N): " );		//	Prints out a question for the user if they want to continue with more temperature conversions
			ans = stdin.next();													//	Stores user's answer if they want to continue with more conversions
			System.out.println();												//	Add an extra line for formating purposes only
			
		} while (!(not.equalsIgnoreCase(ans)));	//	While loop that keep tracks of the user's choice of more conversions
		
		System.out.println("Thank you. Goodbye."); // Displays when user is done with conversions when the while loop stops

	}

}

