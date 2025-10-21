import java.util.Scanner;
public class FunQuiz {
    public static void main(String[] args) {
        
	final String answer = "Paris";
        
	Scanner scanner = new Scanner(System.in);

        int attempts = 3; 
        
	boolean correct = false;

       
        for (int i = 1; i <= attempts; i++) {
            
	     System.out.print("What’s the capital of France? ");
            
	      String userAnswer = scanner.nextLine(); 

           
            if (userAnswer.equalsIgnoreCase(answer)) {
                
		System.out.println("Correct!");
                
             } else {
                
		 if (i < attempts) {
                    
		     System.out.println("Try again!");
                }
            }
        }

        if (!correct) {
            
	    System.out.println("Out of tries! The correct answer is: " + answer);
        }

    }

}
