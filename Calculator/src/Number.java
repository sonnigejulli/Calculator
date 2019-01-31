import java.util.Scanner;

public class Number {
	double n;
	Scanner fromUser = new Scanner (System.in);

Double getNumber() {
	System.out.println("Enter a number in range [-20 to 20]: ");
	n = Double.parseDouble(fromUser.nextLine());
	if(n>20 && n<-20) {
		System.out.println("Enter a valid number");
	} else {
		this.n = n;
	}
	
	return n;
}
}
//void setNumber(double n) {
//	if(n>20 && n<-20) {
//		System.out.println("Enter a valid number");
//	} else {
//		this.n = n;
//	}
//}
//}
//

