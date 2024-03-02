/**
 * title: ProblemOne.java
 * description: A multiplication table 
 * date: Auguest 9, 2023
 * @author Richard S. Huntrods
 * @version 1.00 Aug. 09, 2023
 * @version 2.00 Sep. 25, 2023
 * @copyright 2023 Phat V. Le
 */

/**
 * DOCUMENTATION...
 */

/**                                                                               
 *
 *<H1>Temperature Conversion Application</H1>
 *
 *<H3>Purpose and Description</H3>
 *
 *<P>
 * 	An application that asks the user for input to be converted into  temperature 
 * 	from degrees Fahrenheit to degrees Celcius or vice versa.
 *</P>
 *<P>
 *	This application uses three for loops to complete a multiplication table:
 *	1. For-loop #1 - using System.out.print() function to print out a generic row from 1 to 12
 *		with "|" vertical lines to separate each output from each other and even spaced
 *	2. Parent: For-loop #2 - Based on the value from the inner For-loop prints out proper spacing and alignment for the
 *		multiplication table.
 *	3. Child: For-loop #3 - using System.out.print() function to print out the 
 *		actual multiplication table using if statements to manage ones, tens, and hundredth placements
 * 
 * <H3> Test Plan </H3>
 * EXPECTED:
 * 		Compile ProblemOne.java and run ProblemOne.java
 * 
 * ACTUAL:
 *  	Display results in console as expeceted
 *</P>
 * * <H3> ProblemOne Variables</H3>
 *<P>
 *		tableSize - is a variable of type integer used as a counter to control both outer and inner for-loops
 *		rowNumber - is strictly used for the inner for-loop to produce the actual multiplication table
 *					by printing out the multiplication table through outputs produced as rows
 *		N - is used in the inner for-loop to control the current iteration of the loop by 
 *			comparing it with the tableSize value and is formatted differently based on its value
 *			via the 3 if statements
 *		product - is the formula used for the multiplication table and is reliant on the two for-loops
 *				  to be properly spaced and printed correctly.
 *		
 *</P>
 * * 2. Good data cases:
 * EXPECTED:
 *    Run the program and the following should be produced below:
 *    
 *    |   1 |   2 |   3 |   4 |   5 |   6 |   7 |   8 |   9 |  10 |  11 |  12 |
 *  1 |   1 |   2 |   3 |   4 |   5 |   6 |   7 |   8 |   9 |  10 |  11 |  12 |
 *  2 |   2 |   4 |   6 |   8 |  10 |  12 |  14 |  16 |  18 |  20 |  22 |  24 |
 *  3 |   3 |   6 |   9 |  12 |  15 |  18 |  21 |  24 |  27 |  30 |  33 |  36 |
 *  4 |   4 |   8 |  12 |  16 |  20 |  24 |  28 |  32 |  36 |  40 |  44 |  48 |
 *  5 |   5 |  10 |  15 |  20 |  25 |  30 |  35 |  40 |  45 |  50 |  55 |  60 |
 *  6 |   6 |  12 |  18 |  24 |  30 |  36 |  42 |  48 |  54 |  60 |  66 |  72 |
 *  7 |   7 |  14 |  21 |  28 |  35 |  42 |  49 |  56 |  63 |  70 |  77 |  84 |
 *  8 |   8 |  16 |  24 |  32 |  40 |  48 |  56 |  64 |  72 |  80 |  88 |  96 |
 *  9 |   9 |  18 |  27 |  36 |  45 |  54 |  63 |  72 |  81 |  90 |  99 | 108 |
 * 10 |  10 |  20 |  30 |  40 |  50 |  60 |  70 |  80 |  90 | 100 | 110 | 120 |
 * 11 |  11 |  22 |  33 |  44 |  55 |  66 |  77 |  88 |  99 | 110 | 121 | 132 |
 * 12 |  12 |  24 |  36 |  48 |  60 |  72 |  84 |  96 | 108 | 120 | 132 | 144 |
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 *<P>
 * 3. Bad data cases:
 * EXPECTED:
 *    Run the program and the following should be produced below 
 *    given that the for-loop is incomplete and incorrect criteria
 *    - initial numbers corresponding to the columns
 *    - initial numbers corresponding to the rows
 *    - incorrect formatting issues
 *       
 *      |   1 |   2 |   3 |   4 |   5 |   6 |   7 |   8 |   9 |  10 |  11 |  12 |
 *  2 |   4 |   6 |   8 |  10 |  12 |  14 |  16 |  18 |  20 |  22 |  24 |
 *  3 |   6 |   9 |  12 |  15 |  18 |  21 |  24 |  27 |  30 |  33 |  36 |
 *  4 |   8 |  12 |  16 |  20 |  24 |  28 |  32 |  36 |  40 |  44 |  48 |
 *  5 |  10 |  15 |  20 |  25 |  30 |  35 |  40 |  45 |  50 |  55 |  60 |
 *  6 |  12 |  18 |  24 |  30 |  36 |  42 |  48 |  54 |  60 |  66 |  72 |
 *  7 |  14 |  21 |  28 |  35 |  42 |  49 |  56 |  63 |  70 |  77 |  84 |
 *  8 |  16 |  24 |  32 |  40 |  48 |  56 |  64 |  72 |  80 |  88 |  96 |
 *  9 |  18 |  27 |  36 |  45 |  54 |  63 |  72 |  81 |  90 |  99 | 108 |
 * 10 |  20 |  30 |  40 |  50 |  60 |  70 |  80 |  90 | 100 | 110 | 120 |
 * 11 |  22 |  33 |  44 |  55 |  66 |  77 |  88 |  99 | 110 | 121 | 132 |
 * 12 |  24 |  36 |  48 |  60 |  72 |  84 |  96 | 108 | 120 | 132 | 144 |
 *
 * 
 *
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 *
 *<P>
 * This program and requires the
 * Sun Java SDK version 1.7 or better.
 *</P>
 *                                                                              
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming SDK 1.7 (or later) and the CLASSPATH are set up properly.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 *<DD> Compile:    javac ProblemOne.java</DD>
 *<DD> Run:        java ProblemOne</DD>
 *<DD> Document:   javadoc ProblemOne.java</DD>
 *</DL>
 */

/** primary (public) class for ProblemOne*/
public class ProblemOne {
	/** This static void method is used to run the application */
	public static void main(String[] args) {
		
		System.out.print("     |"); // Starting segment is 5 spaces + |
		
		int tableSize = 12; // is a variable of type integer used as a counter to control the for loops to produce a 12x12 multiplication table
		
		//	This for loop prints out the initial rows of the table
		for (int i = 1; i<=tableSize;i++) {	//This for loop prints out the initial row
			if (i <= 9) {	// if statement that only accepts all values based on the counter tableSize.
				System.out.print("   " + i + " |"); // controls the spacings for the integers between 1-9
			} else { 
				System.out.print("  " + i + " |");	// controls the spacings for the intgers between 10-12
			}
		}
		
		System.out.println();	// creates a carriage spacing for format purposes.
		
		//	This for loop prints out the multiplication table from row 1
		for (int rowNumber = 1; rowNumber <= tableSize; rowNumber++ ){ // For loop prints out initial column and row
			if (rowNumber <=9) {	// if statement that only accepts all values based on the counter tableSize
				System.out.print("   " + rowNumber + " |");	// controls the spacing for the integer values between 1-9 and inserts a formated spacing at the very beginning
			} else {
				System.out.print("  " + rowNumber + " |");	// controls the spacing for the integer values between 10-12
			}
			
			// This for loop prints out the multiplication table from row 2 and onwards until the 12x12 table is complete
			for (int N = 1; N <= tableSize; N++ ) {
				int product = N * rowNumber;
				
					if (product <= 9) {										// Conditional if statement for single digit spacing (3 space)
						System.out.printf(("   " + product + " |"));	
					}
					if (product >= 10 && product <= 99) {					// Conditional if statement for double digit spacing (2 space)
						System.out.printf("  " + product + " |");
					}
					if (product >= 100) {
						System.out.print(" " + product + " |");				// Conditional if statement for triple digit spacing (1 space)
					}	
			
			}	//end of inner for-loop
			System.out.println(); //Add a carriage return at end of the line

		} // end of outer For-loop
		
	}	// end of class main
} // end of Public class ProblemOne

