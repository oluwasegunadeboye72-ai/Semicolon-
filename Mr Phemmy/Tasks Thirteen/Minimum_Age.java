import java.util.Scanner;
public class Minimum_Age{
    public static void main(String []args){

	int Minimum_age = 10;

    	Scanner scanner = new Scanner(System.in);
	
    	System.out.print("Please enter your age:");

	int age = scanner.nextInt();

     	if (age >= Minimum_age){
	
	System.out.print("Welcome to the show!");

	}

	else{

	  System.out.println("Sorry, you're too young!");
        
	}

}
}