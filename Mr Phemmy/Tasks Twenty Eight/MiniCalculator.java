import java.util.Scanner;
public class MiniCalculator {
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the first number: ");
        
	double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        
	double number2 = scanner.nextDouble();

	System.out.print("Enter operation (+ or -): ");
        
	String operation = scanner.next();

        double result;
        


       if (operation.equals("+")) {
            
	   result = number1 + number2;
            
	   System.out.println(number1 + " + " + number2 + " = " + result);
        
	} else if (operation.equals("-")) {
            
		result = number1 - number2;
		
		System.out.println(number1 + " - " + number2 + " = " + result);
        
	} else {
            
		System.out.println("Invalid operation. Please use '+' or '-'.");
            
	
	}

    }

}
	        

            

         

        




     

  

