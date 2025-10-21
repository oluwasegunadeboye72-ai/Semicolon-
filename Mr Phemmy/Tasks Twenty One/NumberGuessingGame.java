import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String []args){

	Scanner scanner = new Scanner(System.in);

	int secret = 8;

	int guess;

	System.out.println("Guess the number:");

	guess = scanner.nextInt();

	if(guess == secret){

	   System.out.println("Correct!");

	} else{

            System.out.println("Try again");

	}

    }

}