import java.util.Scanner;
public class ColorGame{
    public static void main(String []args){

	Scanner scanner = new Scanner(System.in);
    
    	System.out.print("Enter your favourite color:");

	String color = scanner.nextLine();

	if (color.equalsIgnoreCase("red")){

	    for (int count = 0; count < 3; count++){

	         System.out.print("Red is awesome!");

	     }

	  } else {

	      System.out.println("I like red better!");

	  }

      }

 }
