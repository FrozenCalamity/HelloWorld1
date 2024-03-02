/**
 * title: ProblemFour.java
 * description: Demonstration of Switches
 * date: August 09, 2023
 * @author Phat V. Le	
 * @version 1.00 Aug. 09, 2023 - Adding core code for ProblemFour requirements
 * @version 2.00 Sep. 25, 2023 - Adding documentation for ProblemFour requirements
 * @copyright 2023 Phat V Le
 */

/**
 * DOCUMENTATION...
 */

/**                                                                               
 *	Heading 1
 *<H1>ProblemFour</H1>
 *	Heading 3
 *<H3>Purpose and Description</H3>
 *
 *Paragraph 
 *<P>
 * An application that uses switches as a basic menu screen for the user to pick between the 5 variety
 * of conditional statements and their respective definitions.
 *</P>
 *<P>
 * This program will immediately run without any external packages. ProblemFour.java requires itself to be compiled before
 * running the application.   
 * 
 * 
 *
 *</P>
 *<P>
 * This program requires the Sun Java SDK version 1.7 or better.
 * 
 *</P>
 *                                                                              
 *<DL> 
 *definition list "<DL>"
 *
 *<DT> Compiling and running instructions</DT>
 * data term "<dt>"
 *<DT> Assuming SDK 1.7 (or later) and the CLASSPATH are set up properly.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 * data definition "<dd>"
 *<DD> Compile:    javac ProblemFour.java</DD>	
 *<DD> Run:        java ProblemFour.java</DD>
 *<DD> Document:   javadoc ProblemFour.java</DD>
 *</DL>
 */

 /**
 *
 * <H3>Classes</H3>
 *
 *<P>
 * public static void main(String[] args) {<BR>
 * This is the main public class for this application and used to execute the application.
 * 
 *</P>
 *<P>
  
 *</P>
 *
 * <H3>ProblemFour Methods</H3>
 *
 *<P>
 *  public static void main(String args[]) {<BR>
 *  This method is used to execute the application
 *</P>
 *<P>
   
 *</P>
 * <H3>ProblemFour Variables</H3>
 * 	stdin - is a function that prompts the user to provide input to the computer
 * 	userInput - variable that stores the input from stdin given that the user provides a value
 * 
 * <P>
 */

/**
 *
 * <H3>Test Plan</H3>
 * 
 * <P> 
 * 1. Compile and Run the application.
 * 
 * Expeceted
 *	Should print out the following menu displayed by the System.out.println() functions
 *	System.out.println("Java Help Menu")
 *	System.out.println("Select Help on: ");	//	Select Help on:
 *	......
 *	System.out.println();
 *	System.out.print("Selection: ");		//	Selection:	
 *	
 *</P>
 *<P>
 *	
 * ACTUAL:
 *    System should print out the temperature conversion table with all of the numbers even 
 *    spaced and increase in the increments of 100 up for 100 intervals.
 *</P>
 *<P>
 * 
 * 2. Good data cases:
 * EXPECTED:
 * 	User types and confirms: 1
 * 	The switch will trigger the statement below to process
 * 					System.out.println("If: The Java if statement is the most simple decision-making statement. "	// This is a copy-pasted definition from the website
 *							+ "It is used to decide whether a certain statement or block of statements will be executed "
 *							+ "or not i.e if a certain condition is true then a block of statement "
 *							+ "is executed otherwise not.");
 *	The do-while loop will produce the Test Plan menu again.
 *				
 * 	User types and confirms: 2
 * The switch will trigger the statement below to process
 * 					System.out.println("Switch: The Java if statement is the most simple decision-making statement. "	
 *						+ "It is used to decide whether a certain statement or block of statements will be "
 *							+ "executed or not i.e if a certain condition is true then "
 *							+ "a block of statement is executed otherwise not.");
 *	The do-while loop will produce the Test Plan menu again.
 *
 *	User types and confirms: 3
 * The switch will trigger the statement below the process
 *					System.out.println("For: For loop in Java iterates a given set of "
 *							+ "statements multiple times.");
 *	The do-while loop will produce the Test Plan menu again.
 *
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 *<P>
 * 
 * 3. Bad data cases:
 * EXPECTED:
 * 	Run the program and the do-while loop by typing the input value and pressing enter:
 * asfdsafdsaf 	-> see General output
 * 34304972 	-> see General output
 * -43asdfsf	-> see General output
 * Wrong Input!
 * Please try again.
 * General output:
 *  Java Help Menu
 *	Select Help on: 
 *	1. If 
 *	2. Switch 
 *	3. For 
 *	4. While 
 *	5. Do-while 
 *	x. Exit 
 *
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 */ 

/**
 * CODE...
 */
//	Imports the Scanner library to this project
import java.util.Scanner;

/** This is the name of the file ProblemFour*/
public class ProblemFour {

	/** This static void method is used to run the application*/
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner ( System.in ); //Create the Scanner	function for the user to type in values
		
		String userInput; // Variable for comparing cases in switch loop
		//	This is a do while loop that keeps repeating until the user use a condition is fulfilled.
		
		//	Prints out the entire message shown below in the comment section
		do {	
		System.out.println("Java Help Menu");	//	Java Help Menu
		System.out.println("Select Help on: ");	//	Select Help on:
		System.out.println("1. If ");			//	1.	If
		System.out.println("2. Switch ");		//	2.	Switch
		System.out.println("3. For ");			//	3.	For
		System.out.println("4. While ");		//	4.	While
		System.out.println("5. Do-while ");		//	5.	Do-while
		System.out.println("x. Exit ");			//	x.	Exit
		System.out.println();
		System.out.print("Selection: ");		//	Selection:	
		
		//converts the user's input to string value
		userInput = stdin.nextLine().toString();	 
			
		//	This is a switch that compares all of the users' inputs into all of the cases that is shown below
			switch ( userInput ) {
			
				// Case 1 is if user's answers matches the string value of "1"
				case "1":		
					System.out.println();	//creates a new line for format purposes
					System.out.println("If: The Java if statement is the most simple decision-making statement. "	// This is a copy-pasted definition from the website
							+ "It is used to decide whether a certain statement or block of statements will be executed "
							+ "or not i.e if a certain condition is true then a block of statement "
							+ "is executed otherwise not.");
					System.out.println();	//creates a new line for format purposes
					break;	//	leaves the case "1" and returns to the do while loop
				
				//	Case 2 is if user's answer matches the string value of "2"
				case "2":	
					System.out.println();	//creates a new line for format purposes
					//	prints out the definition of the Switch loop
					System.out.println("Switch: The Java if statement is the most simple decision-making statement. "	
							+ "It is used to decide whether a certain statement or block of statements will be "
							+ "executed or not i.e if a certain condition is true then "
							+ "a block of statement is executed otherwise not.");
					System.out.println();	//creates a new line for format purposes
					break;	//	leaves the case "2" and returns to the do while loop
				
				// Case 3 is if user's answer matches the string value of "3"
				case "3":
					System.out.println();	//	creates a new line for format purposes
					//	Prints out the definition of the For loop
					System.out.println("For: For loop in Java iterates a given set of "
							+ "statements multiple times.");
					System.out.println();	//creates a new line for format purposes
					break;	//	leaves the case "3" and returns to the do-while loop
				
				// Case 4 is if user's answer matches the string value of "4"
				case "4":
					System.out.println();	//	creates a new line for format purposes
					//	prints out the definition of the While loop
					System.out.println("While: The Java while loop executes a set of instructions until "
							+ "a boolean condition is met.");
					System.out.println();	//	creates a new line for format purposes
					break;	//	leaves the case "4" and returns to the do-while loop
				
				// Case 5 is if user's answers matches the string value of "5"
				case "5":
					System.out.println();	//	creates a new line for format purposes
					//	prints out the definition of the Do-while loop that was found in the 
					System.out.println("Do-while: The do-while loop executes a set of statements at least once, even if "
							+  "the condition is not met. After the first execution, it repeats the "
							+ "iteration until the boolean condition is met.");
					System.out.println();	//	creates a new line for format purposes
					break;	//	leaves the case	"5" and returns to the do-while loop
				
				//	case "x"
				//	default case when none of the specific cases match 
				//	and prints out a message for the user to try another input
				default:	
					
					//	prints a new line for formatting purposes
					System.out.println();
					
					//	prints out the message "Wrong Input!"
					System.out.println("Wrong Input!");	
					
					//	prints out the message "Please Try Again"
					System.out.println("Please Try Again.");
					//	printsa new line for formatting purposes
					System.out.println();
					break;
			}		
		} while (!(userInput.equalsIgnoreCase("x")));
		//prints out a final message for the user for using the application
		System.out.println("Thank you.");
		//prints out a final message for the user for using the application
		System.out.println("Good bye.");
		
		
	}

}
