
/*
 Task

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
import java.util.Scanner;

public class CalculatorApp { 

	public static void main(String[] args) throws FileNotFoundException {


System.out.println("Enter a number in range [-20 to 20]: ");
		while(true) {
			

			Scanner fromUser = new Scanner(System.in);
			String input = fromUser.nextLine();
			
			
			if("break".equalsIgnoreCase(input)){
				break;	
			}
			Calculations calc1 = new Calculations();
			double number1 =  Double.parseDouble(input);
			validateNumber(number1);
			calc1.number1 = number1;
			
//			if (number1>20 || number1<-20) {
//				System.out.println("Enter a valid number: ");
//				continue;
//			}
			
			
			System.out.println("Enter a number in range [-20 to 20]: ");
			double number2 = Double.parseDouble(fromUser.nextLine());
			validateNumber(number2);
			
//			if (number2>20 || number2<-20) {
//				System.out.println("Enter a valid number: ");
//				continue;
//			}
			calc1.number2 = number2;
			System.out.println("Enter an operation +, -, *, /");
			calc1.operation = fromUser.nextLine();
			calc1.calculate();
			
		}

	}
	public static void validateNumber(double num) {
			
		if (num>20 || num<-20) {
			System.out.println("Enter a valid number: ");
		} 
	}

	
}
