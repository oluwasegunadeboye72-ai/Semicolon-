import java.util.Scanner;
public class SecretNumber{
    public static void main(String []args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a password:");

	String password = scanner.nextLine();

    if(password.equals("Secret")){

	System.out.print("Access granted! Welcome!");

	}

	else{

	     System.out.print("Access denied!");
	}

}
}