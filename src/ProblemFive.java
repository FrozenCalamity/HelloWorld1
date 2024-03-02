/**
 * title: ProblemFive.java
 * description: Print Prime Numbers up to 10,000 on a single row
 * date: August 13, 2023
 * @author Phat V. Le	
 * @version 1.00 Aug. 13, 2023 - Adding core code for ProblemFive requirements
 * @version 2.00 Sep. 26, 2023 - Adding documentation for ProblemFive requirements
 * @copyright 2023 Phat V Le
 */

/**
 * DOCUMENTATION...
 */

/**                                                                               
 *	Heading 1
 *<H1>ProblemFive</H1>
 *	Heading 3
 *<H3>Purpose and Description</H3>
 *
 * 	Paragraph 
 *<P>
 * An application that uses two for loops to sift through 10000 numbers and produces a list of
 * numbers that are prime numbers and formatted to be separated by a space or indent
 *</P>
 *<P>
 * This program will immediately run without any external packages. ProblemFive.java requires itself to be compiled before
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
 * definition list "<DL>"
 *<DT> Compiling and running instructions</DT>
 * data term "<dt>"
 *<DT> Assuming SDK 1.7 (or later) and the CLASSPATH are set up properly.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 * data definition "<dd>"
 *<DD> Compile:    javac ProblemFive.java</DD>	
 *<DD> Run:        java ProblemFive.java</DD>
 *<DD> Document:   javadoc ProblemFive.java</DD>
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
 *		With int "i", "num" and "primeNumber" initialized, the first for-loop generates 
 *		a "counter" up to 10000. 
 *		When the counter increments to another number, the 2nd for loop begins and initializes
 *		the num = i. The for loop then goes through the motions by dividing i with num and 
 *		decreases num until i % 1 happens. If a prime number does exist then the counter will equal 2
 *		and primeNumbers is assigned and then primeNumbers is printed.
 *		
 *		Example of operation
 *		Iteration 6:
 *		
 *		for( num = 6; num>= 1; num--)
 *			if ( 6 % 6 == 0)
 *				counter++
 *		 	if ( 6 % 5 == 0)		
 *			if ( 6 % 4 == 0)	
 *			if ( 6 % 3 == 0)
 *				counter++
 *			if ( 6 % 2 == 0)
 *			if ( 6 % 1 == 0)
 *				counter++
 *		Therefore in "if (counter == 2)",
 *				  (3 == 2)
 *					primeNumber is not printed
 *		Process repeated for new i from outer for-loop iteration.
 *		for (i = 7; i <= 10000; i++)
 *			counter = 0
 *			
 *			for (num = 7; num>=1; num--)
 *				if (7 % 7 == 0)
 *					counter++
 *					if (7 % 6 == 0)
 *					if (7 % 5 == 0)
 *					if (7 % 4 == 0)
 *					if (7 % 3 == 0)
 *					if (7 % 2 == 0)
 *					if (7 % 1 == 0)
 *						counter++
 *			if (counter == 2)
 *				primeNumbers = ... + 7 + " ";
 *		Therefore this number is printed as a result of being an actual prime number.
 *		
 *</P>
 *
 * <H3>ProblemFive Methods</H3>
 *
 *<P>
 *  public static void main(String args[]) {<BR>
 *  This method is used to execute the application
 *</P>
 *<P>
   
 *</P>
 * <H3>ProblemFive Variables</H3>
 * 	primeNumber - is a combination of strings and prime numbers from the for loop
 *  i - is just a counter for the for loop
 *  num - is a counter to test the initial counter i by comparison using the % operator
 * <P>
 */

/**
 *
 * <H3>Test Plan</H3>
 *	Run the application and System.out.println() will produce a result from the console.
 *<P>
 *	
 * ACTUAL:
 *    Displays as expected from the application
 *</P>
 *<P>
 * 2. Good data cases:
 * EXPECTED:
 *	Run the program and the application will produce the following below:
 *	2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101...
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 *<P>
 * 3. Bad data cases:
 * EXPECTED:
 * 	Run the program: 
 * 	Test 1:
 * 		Produce all of the numbers without eliminating non-prime numbers
 *		2 3 4 5 6 7 8 9 10...
 *
 * 	Test 2:
 * 		Run the program:
 * 		Produce infinite running loop
 * 		2 3 4 5 6 7 8 9 10...
 * 		Freezing computer
 * 		Task Manager exiting program
 * 	
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 */ 

/**
 * CODE...
 */
/** Primary public class for ProblemFive*/
public class ProblemFive 
{
	/** This static void method is required for the program to run*/
	public static void main(String[] args) 
	{
		int i = 0;	// integer value
		int num = 0;	// integer value
		
		//Empty String
		String primeNumbers = "";
		//	For loop used to print out all of the prime numbers up to 10000
		for (i = 1; i <= 10000; i++) 
		{
			
			int counter = 0;	//	counter used in the inner for loop
				
				//for-loop that checks the values 
				for(num = i; num>=1; num--) 
				{
					// the condition for the prime numbers is here where there can only be a number that
					// can be divided by itself and by num 1
					if ( (i % num) == 0 ) 
					{
						// standard form of a count-up counter
						counter = counter + 1;
				
					}
				}
			// a if statement that only prints out the prime numbers only
			// when the counter is 2 which means that a number was exclusively able to 
			//	divide by itself and divide by one.
			if ( counter == 2 ) 
			{
			
					//Append the Prime number to the String
					primeNumbers = primeNumbers + i + " ";		
			} //end of if loop #2
		
			
		}
		//	print out the following when the 
		System.out.println("Prime numbers from 1 to 10000 are :");
		//	print out all the numbers that are up to 10000
		System.out.println(primeNumbers);
	}
}

