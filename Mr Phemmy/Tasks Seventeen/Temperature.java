import java.util.Scanner;
public class Temperature{
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature (like 25):");

        int temperature = scanner.nextInt();

    
        if(temperature > 30){

	   System.out.print("Hot!");
	
	} else if(temperature >= 15 && temperature <= 30){

	    System.out.print("Nice!");

	} else{

	    System.out.println("Cold");
        
        }
   
     }

}



	     