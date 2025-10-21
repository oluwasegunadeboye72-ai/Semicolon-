import java.util.Scanner;
public class PrimeChecker {
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);

      	System.out.print("Enter a number:");
        
	int number = scanner.nextInt();

        boolean isPrime = true;

        
        if (number < 2) {
            
	    isPrime = false;
        
	 } else {
            
            for (int i = 2; i < number; i++) {
                
		if (number % i == 0) {
                    isPrime = false; 
                    
                }
            }
        }

        
        if (isPrime){
            
	   System.out.println("Prime!");
        
	} else {
            
	    System.out.println("Not prime!");
        }

     }

  }

