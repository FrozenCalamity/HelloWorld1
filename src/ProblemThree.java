/**
 * title: ProblemThree.java
 * description: Temperature Conversion Table for Farhenheit and Celsius from -40F and -40C
 * date: August 09, 2023
 * @author Phat V. Le	
 * @version 1.00 Aug. 09, 2023 - Adding core code for ProblemThree requirements
 * @version 2.00 Sep. 25, 2023 - Adding documentation for ProblemThree requirements
 * @copyright 2023 Phat V Le
 */

/**
 * DOCUMENTATION...
 */

/**                                                                               
 *	Heading 1
 *<H1>Temperature Conversion Table</H1>
 *	Heading 3
 *<H3>Purpose and Description</H3>
 *
 *Paragraph 
 *<P>
 * An application that converts temperature from a starting value to degrees Fahrenheit and degrees Celcius following 100 increments of 5.
 *</P>
 *<P>
 * This program will immediately run without any external packages. 
 * 
 *</P>
 *<P>
 * This program requires the Sun Java SDK version 1.7 or better.
 * 
 *</P>
 *                                                                              
 *<DL>
 * definition list "<DL>"
 *<DT> Compiling and running instructions</DT>
 * data term "<dt>"
 *<DT> Assuming SDK 1.7 (or later) and the CLASSPATH are set up properly.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 * data definition "<dd>"
 *<DD> Compile:    javac ProblemThree.java</DD>	
 *<DD> Run:        java ProblemThree.java</DD>
 *<DD> Document:   javadoc ProblemThree.java</DD>
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
 * <H3>ProblemThree Methods</H3>
 *
 *<P>
 *  public static void main(String args[]) {<BR>
 *  This method is used to execute the application
 *</P>
 *<P>
   
 *</P>
 * <H3>ProblemThree Variables</H3>
 * 		
 * 		ftype - double type used to convert celsius values to fahrenheit values in the for-loop
 * 		ctype - doubel type used to convert fahrenheit values to celsius values in the for-loop
 * 		tempValue - is the initial value for both fahrenheit and celsius to start
 * 		increm - used in the for-loop to increase the for-loop counter by 5 each time instead of by 1 value
 * 		counter - is the limit that the for loop should produce ie. 100 items per temperature unit 
 * <P>
 */

/**
 *
 * <H3>Test Plan</H3>
 *
 *<P>
 * 1. Run the application.
 * EXPECTED:
 * 		
 * ACTUAL:
 *    System should print out the temperature conversion table with all of the numbers even 
 *    spaced and increase in the increments of 100 up for 100 intervals.
 *</P>
 *<P>
 * 2. Good data cases:
 * EXPECTED:
 *    The for-loop should produce test cases when the application runs:
 *    0 -> output should be 	 	  0.000     -20.556  |      0.000     23.000
 *    40 -> output should be 		 40.000       1.667  |     40.000     95.000
 *    200 -> output should be		200.000      90.556  |    200.000    383.000
 *    -20 -> output should be		-20.000     -31.667  |    -20.000    -13.000
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 *<P>
 * 3. Bad data cases:
 * EXPECTED:
 *    The for-loop should produce test cases when the application runs:
 *    Case 1: Formatting problems and alignment problem
 *    
 *       -30.000     -37.222  |    -30.000    -31.000
 *  -25.000     -34.444  |    -25.000    -22.000
 *  	-20.000     -31.667  |    -20.000    -13.000
 *  				-15.000     -28.889  |    -15.000     -4.000
 *  -10.000     -26.111  |    -10.000      5.000
 *   			-5.000     -23.333  |     -5.000     14.000
 *    				0.000     -20.556  |      0.000     23.000
 *    			5.000     -17.778  |      5.000     32.000
 *    Case 2: Significant Digit and formating problem
 *    
*  		-30.000     -37.222222222  |    -30.000    -31.000
*  		-25.0000    -34.444444444  |    -25.000    -22.000
*  		-20.0000    -31.667777777  |    -20.000    -13.000
*  		-15.0000    -28.889999999  |    -15.000     -4.000
*  		-10.0000    -26.111111111  |    -10.000      5.000
*   	-5.0000     -23.333333333  |     -5.000     14.000
*   	 0.0000     -20.556666666  |      0.000     23.000
*   	 5.0000     -17.778888888  |      5.000     32.000
*   
*   Case 3: For-loop iteration problems passing 100 iterations 
*   	 ...			...	  |	   ...	      ...
*   	 465.000     240.556  |    465.000    869.000
*   
*   Case 4: For-loop iteration problems not passing 100 iterations
*   	...			...		 |	  ...	     ...
*   	455.000     232.222  |    455.000    842.000
*   	
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 */ 

/**
 * CODE...
 */

/** Primary (public) class for ProblemThree */
public class ProblemThree {
	/** This method is to run the conversion table*/
	public static void main(String[] args) {
		
		//placeholder for the Fahrenheit column side
		double ftype;	
		
		//placeholder for the Celsius column side
		double ctype;	
		
		//initial Fahrenheit & Celsius value
		double tempValue = -40; 
		
		// integer used for increasing the temperature by 5 after a loop iteration
		int increm = 5;
		// counter used to limit the counter to only 100 loops
		int counter = 100;
		 
		// Title with 12 spacing
		System.out.println("            Temperature Conversion Tables");
		// Sub heading for conversion table with a specific spacing format (7 6 7 spacing)
		System.out.println("       Temperature      |       Temperature"); 
		// Sub sub heading for conversion table with a specific spacing format (8 7 8 spacing)
		System.out.println("        (degrees)       |        (degrees)");
		// Temperature symbols with a specific spacing format (6 11 5 6 11 spacing)
		System.out.println("      F           C     |      C           F");
		
		//for loop that generates the conversion tables from -40 to 460
		for (int i =0; i < counter; i++) {
			
			//Formula for converting Fahrenheit to Celsius: T(C) = (T(F) − 32 ) * 5 / 9
			ctype = (tempValue - 32) * 5 / 9;
			
			//Formula for converting Celsius to Fahrenheit: T(F) = (T(C) * 9 / 5) + 32
			ftype = (tempValue * 9 / 5 ) + 32; 
			
			// Incremental formula for calculating the temperature every 5 degrees
			tempValue = tempValue + increm;	
			
			//Formatting for the proper spacing used in the solutions to have right formating
			System.out.printf("%10.3f  %10.3f  | %10.3f %10.3f", tempValue, ctype, tempValue, ftype);	
			
			// Formatting purposes for the conversion table
			System.out.println();
			
		}	// end of for-loop 
		
		
	}	// end of public class ProblemThree
}