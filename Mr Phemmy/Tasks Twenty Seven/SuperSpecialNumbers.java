import java.util.Scanner;
public class SuperSpecialNumbers {
    
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);
        
	boolean checkAgain = true;

        while (checkAgain) {
            
	System.out.println("Finding super special numbers between 1 and 20...");

            
	   for (int box = 1; box <= 20; box++) {  
                
		if (box % 3 == 0 && box % 5 == 0) {
                    
		    System.out.println("Super special number: " + box);
                
		}

	     }

             System.out.print("Do you want to check again? (yes/no): ");
           
		String response = scanner.nextLine().trim().toLowerCase();

             if (!response.equals("yes")) {
                

		checkAgain = false;
                
		System.out.println("Goodbye!");
            
	    }

        }

     }

}

        