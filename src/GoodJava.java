/**
 * title: GoodDocs.java
 * description: An example of javadoc use and proper code documentation
 * date: November 11, 2003
 * @author Richard S. Huntrods
 * @version 1.0
 * @copyright 2001-2003 Richard S. Huntrods
 */

/**
 * DOCUMENTATION...
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
 * <H3>Classes</H3>
 *
 *<P>
 * public class GoodDocs extends JFrame {<BR>
 * This is the main public class for this application. It extends (inherits from) JFrame
 * to provide access to Java Swing Frame methods for the GUI.
 *</P>
 *<P>
   private class TextFieldHandler implements ActionListener {<BR>
   Class TextFieldHandler implements ActionListner to provide the event handling
   for this application.  It is a private inner class, which gives it access to 
   all of the GoodDocs instance variables
 *</P>
 *
 * <H3>GoodDocs Methods</H3>
 *
 *<P>
   public GoodDocs() {<BR>
   Constructor for GoodDocs class -  this method is used to set up the GUI
 *</P>
 *<P>
   public static void main(String args[]) {<BR>
   This method is used to execute the application
 *</P>
 *<P>
   private String convertFtoC(String input) {<BR>
   This method performs the actual conversion from Fahrenheit to Celcius.  The method
   takes input as a String, and returns a String to provide better coordination with
   GUI components, which return or require Strings
 *</P>
 * <H3>TextFieldHandler Methods</H3>
 *
 *<P>
 * public void actionPerformed(ActionEvent event) (<BR>
 * This method is required for an ActionListener to process the events
 *
 * <H3>GoodDocs Instance Variables</H3>
 *
 *<P>
 * private JTextField degreesF; - JTextField to hold input degrees F.
 * private JLabel degreesC; - JLabel to hold output results, degrees C.
 *</P>
 */

/**
 *
 * <H3>Test Plan</H3>
 *
 *<P>
 * 1. Run the application.
 * EXPECTED:
 *    GUI frame should display the following:
 *    title = "Temperature Conversion"
 *    label = "Temperature Conversion Program"
 *    label = "Input Temperature"
 *    textbox for receiving input temperature.
 *    label for input temperature = "Degrees F."
 *    label for output temperature = "Output Temperature: ... Degrees C."
 *    label to display output temperature
 *    overall size should be 300 by 100 pixels
 * ACTUAL:
 *    GUI frame displays as expected.
 *</P>
 *<P>
 * 2. Good data cases:
 * EXPECTED:
 *    Run the following test cases by typing the input value and pressing enter:
 *    0 -> output should be -17.777777...
 *    32 -> output should be 0
 *    212 -> output should be 100
 *    -40 -> output should be -40
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 *<P>
 * 3. Bad data cases:
 * EXPECTED:
 *    Run the following test cases by typing the input value and pressing enter:
 *    'q' -> output should be -17.777777...
 *    (note - this will be true for any non-numeric input)
 * ACTUAL:
 *    Results displayed as expected.
 *</P>
 */ 

/**
 * CODE...
 */

/** Java core packages */
import java.awt.*;
import java.awt.event.*;

/** Java extension packages to support Swing */
import javax.swing.*;

/** primary (public) class for GoodDocs */
public class GoodDocs extends JFrame {
   /** JTextField to hold input degrees F. */ 
   private JTextField degreesF;
   /** JLabel to hold output results, degrees C. */
   private JLabel degreesC;

   /** Constructor for GoodDocs class -  this method is used to set up the GUI */
   public GoodDocs() {
      // call the JFrame parent class with the window title
      super("Temperature Conversion");

      // we need the container for JFrames in order to add components
      Container container = getContentPane();
      // default layout is BorderLayout - we want a FlowLayout
      container.setLayout(new FlowLayout());

      // private label to store the heading
      JLabel title = new JLabel("Temperature Conversion Program");
      container.add(title);

      // private label to store prompt text
      JLabel prompt = new JLabel("Input Temperature: ");
      container.add(prompt);

      // create an instance of the JTextField for a specific number of columns
      degreesF = new JTextField(5);
      container.add(degreesF);

      // private label for the input units
      JLabel units = new JLabel("Degrees F.");
      container.add(units);

      // create an instance of the JLabel holding the output result
      degreesC = new JLabel("Output Temperature: ... Degrees C.");
      container.add(degreesC);

      // register the TextField event handler - this is an inner class
      TextFieldHandler handler = new TextFieldHandler();
      degreesF.addActionListener(handler);

      // set the applications size and make it visible
      setSize(300, 100);
      setVisible(true);
   }

   /** This method is used to execute the application */
   public static void main(String args[]) {
      // create an instance of our application
      GoodDocs application = new GoodDocs();

      // set the JFrame properties to respond to the window closing event
      application.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE );
   }

   /** This method performs the actual conversion from Fahrenheit to Celcius.  The method
       takes input as a String, and returns a String to provide better coordination with
       GUI components, which return or require Strings */
   private String convertFtoC(String input) {
    // variables to store the real values of the Strings
    double tempF = 0.0;
    double tempC = 0.0;

    // use a try-catch block to contain data conversion exceptions
    try {
        // use the Double wrapper class to parse the string to a double
        tempF = Double.parseDouble(input);
    }
    catch (NumberFormatException nfe) {
        // no need to do anything here - errors will leave tempF = 0.0
    }

    // perform the conversion
    tempC = 5.0 / 9.0 * (tempF - 32.0);

    // return the result as a String
    return Double.toString(tempC);
   }

   /** Class TextFieldHandler implements ActionListner to provide the event handling
       for this application.  It is a private inner class, which gives it access to 
       all of the GoodDocs instance variables */
   private class TextFieldHandler implements ActionListener {

      /** This method is required for an ActionListener to process the events */
      public void actionPerformed(ActionEvent event) {
         String string = "";

         // The user pressed Enter in  the JTextField textField1
         if(event.getSource() == degreesF)
            // retrieve the input as a String
            string = convertFtoC(event.getActionCommand());

            // convert input to output and display
            degreesC.setText("Output Temperature: " + string + " Degrees C.");
      }

   }  // end of the private inner class TextFieldHandler

}  // end of public class GoodDocs
