import java.util.Scanner;

public class Number {
	double n;
	Scanner fromUser = new Scanner (System.in);
	String input = fromUser.nextLine();
	
	public  double validateNumber() {
		double n = Double.parseDouble(input);
		if(n>20 || n<-20) {
			System.out.println("Enter a valid number: ");
			}else {
	this.n = n;
		} return n;
	} 
}



//Double getN() {
//	return n;
//}
//void setN(double n) {
//	double number1 = Double.parseDouble(input);
//	if(n>20 || n<-20) {
//		System.out.println("Enter a valid number: ");
//		}else {
//	this.n = number1;
//}
//}

	