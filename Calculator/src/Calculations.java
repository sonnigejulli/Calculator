import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Calculations {

	double number1, number2;
	private double getNumber1() {
		return number1;
	}

	private void setNumber1(double number1) {
		this.number1 = number1;
	}

	private double getNumber2() {
		return number2;
	}

	private void setNumber2(double number2) {
		this.number2 = number2;
	}

	String operation;

	private String getOperation() {
		return operation;
	}

	private void setOperation(String operation) {
		this.operation = operation;
	}

	Scanner fromUser = new Scanner(System.in);

	public void calculate() throws FileNotFoundException {
		try (PrintWriter writer = new PrintWriter("C:\\Users\\Victoria_Kiriyenko\\eclipse-workspace\\calc_file")) {
			LocalDateTime now = LocalDateTime.now();
			double result = 0;
			if (operation.equals("/") && number2 == 0) {
				System.out.println("Cannot divide to 0");
				return;
			} else if (operation.equals("-")) {
				result = number1 - number2;
			} else if (operation.equals("*")) {
				result = number1 * number2;
			} else if (operation.equals("/")) {
				result = number1 / number2;
			} else if (operation.equals("+")) {
				result = number1 + number2;
			} else {
				result = 0;
			}
			writer.println(result);
			writer.println(now);
		}
	}
}
