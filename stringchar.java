//Aaron Goode
//Manipulation of strings and chars
//HW2

import java.util.Scanner;
public class stringchar {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String strTogether, first, last, strFormatted, strStrange, strYelling;
		boolean theSame;
		char init1, init2;
		int relativeTo, firstlength, lastlength, a;

		System.out.println("Enter your first name: ");
		first = console.next();
		System.out.println("Enter your last name: ");
		last = console.next();
//1	Adds first name to the end of last name	
		strTogether = last + first;
		System.out.println("Smooshed together, my name looks like this: " + strTogether);
		
//2 Determines whether or not first name and last name are the same
		theSame = first.equals(last);
		System.out.println("Is my last name the same as my first name: " + theSame);

//3	Formats (1) with a comma after the last name	
		strFormatted = last.concat(", "+first);
		System.out.println("Formatted, my name looks like this: " + strFormatted);
//4	Prints initials
		init1 = first.charAt(0);
		init2 = last.charAt(0);
		System.out.println("My initials are: " + init1 + init2);

//5	Determines the displacement from first letter in last name to first letter in first name	
		relativeTo = first.compareTo(last);
		System.out.println("Relative to my last name, my first name occurs: " + relativeTo);
	
//6	Replaces the letter 'e' with the letter 'x'	
		strStrange = strFormatted;
		System.out.println("Although it doesn't make much sense: " + strStrange.replace('e', 'x'));
	
//7	formats the name and makes all letters Upper Case
		strYelling = strFormatted;
		System.out.println("Stop yelling: "+ strYelling.toUpperCase());
	
//8	Counts the number of characters in both the first and last name
		firstlength = first.length();
		lastlength = last.length();
		System.out.println("My last name is " + lastlength + " characters. " + "My first name is " + firstlength + " characters.");
		
//9	Prints only the last name
		a = strFormatted.indexOf(',');
		System.out.println("Using the substring method, my last name is: " + strFormatted.substring(0,a));
	}

}
