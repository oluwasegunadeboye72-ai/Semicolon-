import java.util.Scanner;
public class BankBalance{
       public static void main(String []args){
  
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your bank account balance: ");

	double balance = scanner.nextDouble();

	if (balance <= 100) {
	
	String status = "Low";

	} else if (balance <= 1000){
          
           String status = "Medium";
	
	} else {

	   String status = "High";
	}

	System.out.println("Your balance level is: " + status);
	
	}

}
}