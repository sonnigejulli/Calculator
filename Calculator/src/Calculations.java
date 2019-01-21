import java.util.Scanner;

public class Calculations {
	double number;
	double result;
	Scanner fromUser = new Scanner (System.in);
	

	Double getNumber(double number) {
		if (number <= -20 && number >= 20) {
			System.out.println("Number should be in range from -20 to 20");
		} else {
		 number = Double.parseDouble(fromUser.nextLine());
	}
		return number;
	}



	public double add(double number1, double number2) {
			return result = number1+number2;
		}
		public double subtract(double number1, double number2) {
			return result = number1-number2;
		}
		public double multiply(double number1, double number2) {
			return result = number1*number2;
		}
		public double divide(double number1, double number2) {
			return result = number1/number2;
		}
}



