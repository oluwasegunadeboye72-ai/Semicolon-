import java.util.Scanner;
public class MathTeacher {
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);

        int total = 0;
        int scoreCount = 0; 

        
        for (int i = 1; i <= 5; i++) {
            
	     System.out.print("Enter score #" + i + " (0 to 100): ");
            
	     int score = scanner.nextInt(); 

           
            if (score >= 0 && score <= 100) {
                
		total += score;  
                
		scoreCount++;
            
	     } else {
                
		 System.out.println("Invalid score! Please enter a number between 0 and 100.");
                
            }
        }

     }

}