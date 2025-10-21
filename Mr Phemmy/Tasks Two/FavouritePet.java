import java.util.Scanner;
public class FavouritePet{
    public static void main(String []args){

	Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter an animal:");
	
	String animal = scanner.nextLine();

     if(animal.equals("Dog")){

	System.out.print("Woof! dogs are awesome!");

	}

	else{
	     
             System.out.print("Cool choice, but i love dogs!");
		
        }

}
}

	     