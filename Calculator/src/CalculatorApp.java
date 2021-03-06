/*
 * Task

Write a small calculator console application that will follow next
requirements:

accepts numbers from -20 to 20, if more than 20 or less -20 - returns a
warning message.

Build application using maven

write results to a file with date/time of calculation

arrange application structure according to OOP

Create your personal Git repo with the results and application sources
*/
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;


public class CalculatorApp {
	public static void main(String[] args) throws FileNotFoundException {

		double result, number1, number2;
		String action;
		Scanner fromUser = new Scanner (System.in);
		PrintWriter writer = new PrintWriter("C:\\Users\\Victoria_Kiriyenko\\eclipse-workspace\\calc_file");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Enter a number in range [-20 to 20]: ");
		number1=Double.parseDouble(fromUser.nextLine());
		
		
		System.out.println("Enter a number in range [-20 to 20]: ");
		number2=Double.parseDouble(fromUser.nextLine());

		System.out.println("Enter an action +, -, *, /");
		action = fromUser.nextLine();

		if (action.equals("/") && number2 == 0) {
			System.out.println("Cannot divide to 0");
			return;
		} else if (action.equals("-")) {
			result = number1 - number2;
		} else if (action.equals("*")) {
			result = number1 * number2;
		} else if (action.equals("/")) {
			result = number1 / number2;
		} else if (action.equals("+")) {
			result = number1 + number2;
		} else {
			result = 0;
		}
		
	    writer.println(result);
	    writer.println(now);
	    writer.close();
	    fromUser.close();
	}
}