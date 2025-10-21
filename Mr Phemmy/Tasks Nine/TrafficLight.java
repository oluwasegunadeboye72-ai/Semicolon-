import java.util.Scanner;
public class TrafficLight{
    public static void main(String []args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your color:");

	String color = scanner.nextLine();

     if(color.equals ("User")){

	System.out.print("Go!");
	
	}

	else{

	     System.out.print("Stop!");
        }

}
}