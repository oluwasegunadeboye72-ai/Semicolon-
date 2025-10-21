import java.util.Scanner;
public class FavouriteNumber{
    public static void main(String []args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number:");

	int number = scanner.nextInt();

	int favoriteNumber = 7;

    if(number == favoriteNumber){

	System.out.print("That's my favourite number!");

	}

	else{

             System.out.print("Nice try, guess again!");
        
        }

}
}

     











