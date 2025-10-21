import java.util.Scanner;
public class TicketPrices{
    public static void main(String []args){

	final int adultprice = 10;

	final int childprice = 5;

	Scanner scanner = new Scanner(System.in);

	System.out.println("Welcome to the Ticket Booth! please enter your age:");

	int age = scanner.nextInt();

	if(age >= 18){

	   System.out.println("You qualify for an adult ticket.");

	   System.out.println("Your ticket price is: $" + adultprice);

	} else{

	    System.out.println("You qualify for a child ticket.");

	    System.out.println("You ticket price is: $" + childprice);

       }

    }

}