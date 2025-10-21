import java.util.Scanner;
public class Animal{
    public static void main(String []args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter my animal:");

	String animal = scanner.nextLine();

    if(animal.equals ("Dog")){

	System.out.print("Correct!");

	}

	else{

	    System.out.print("Nope,");
	}

}
}