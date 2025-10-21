import java.util.Scanner;
public class ColorGuessingGame {
    public static void main(String[] args) {
        
	final String favoriteColor = "blue"; 
        
	Scanner scanner = new Scanner(System.in);

        for (int tries = 1; tries <= 3; tries++) {
            
	     System.out.print("Guess the color: ");
            
	     String guess = scanner.nextLine(); 

            
            if (guess.equalsIgnoreCase(favoriteColor)) {
                
		System.out.println("Correct!");
                
            } else if (guess.equalsIgnoreCase("green")) {
                
		System.out.println("Close!");
            } else {
                
		System.out.println("Wrong!");
            }

            
            if (tries == 3) {
                
		System.out.println("Out of tries! The correct color was: " + favoriteColor);

            }

         }

      }

  }
        