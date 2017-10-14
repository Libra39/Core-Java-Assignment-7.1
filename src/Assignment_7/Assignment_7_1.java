
/**
 * Write a program to convert an int variable to String using an inbuilt function of String class.
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
package Assignment_7;																										// Package declared
public class Assignment_7_1 {																								// Class declared	
	public static void main(String[] args) {																				// Main method started
		System.out.println("\nBelow program will show the 2 ways "															// Print Statement	
				+ "to convert an int variable to String using an inbuilt function of String class\n");
		System.out.println("Way 1 - Using Integer.toString() inbuilt function to convert an Integer variable to String");
		int myFirstInteger = 369;																							// Variable myFirstInteger declared and assigned a value of 369
		String string1 = Integer.toString(myFirstInteger);																	// Using Integer.toString() inbuilt function to convert an Integer variable to String
	    System.out.println("Integer Converted String1 = " + string1); 														// Print Statement
	    int mySecondInteger = -936;																							// Variable mySecondInteger declared and assigned a value of -936
	    String string2 = Integer.toString(mySecondInteger);																	// Using Integer.toString() inbuilt function to convert an Integer variable to String
	    System.out.println("Integer Converted String2 = " + string2);														// Pint Statement
	    System.out.println("\nWay 2 - Using String.valueOf() inbuilt function to convert an Integer variable to String"); 	// Pint Statement
	    int myThirdInteger = 369;																							// Variable myThirdInteger declared and assigned a value of 369
	    String string3 = String.valueOf(myThirdInteger);																	// Using String.valueOf() inbuilt function to convert an Integer variable to String
	    System.out.println("Integer Converted String3 = " + string3);													 	// Pint Statement
	    int myForthInteger = -936;																							// Variable myThirdInteger declared and assigned a value of -936
	    String string4 = String.valueOf(myForthInteger);																	// Using String.valueOf() inbuilt function to convert an Integer variable to String
	    System.out.println("Integer Converted String3 = " + string4);													 	// Pint Statement
	}																														// Main method closed
}																															// class Assignment_7_1 closed
