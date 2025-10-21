import java.util.Scanner;
public class CheckYourAgeAndHeight{
    public static void main(String []args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter your age:");

	int age = scanner.nextInt();

	System.out.print("Enter your height is cm:");

	int height = scanner.nextInt();

	if (age >= 12){

	   if (height >= 140){

	      System.out.println("Ride allowed!");

	    } else{

		System.out.println("Too short!");

	    }

	  } else{

	      System.out.println("Too young!");

	  }

        }

    }

