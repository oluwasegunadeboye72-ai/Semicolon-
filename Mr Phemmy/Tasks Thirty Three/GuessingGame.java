import java.util.Scanner;
public class GuessingGame{
    public static void main(String []args){

	final int answer = 25;

	Scanner scanner = new Scanner(System.in);

	int guess = -1;

	System.out.println("Welcome to the Smart Guessing Game!");

	System.out.println("Try to guess the number I'm thinking of between 1 and 50");

	while (guess != answer){
	
	    System.out.println("Enter your guess:");

	    guess = Scanner.nextInt();

	    if (guess > answer){

	        System.out.println("Too high!");

	    } else 

	    if (guess < answer){

		System.out.println("Too low!");

	    } else{

		 System.out.println("Correct!");

	    }

         }

       }

     }