import java.util.Scanner;
public class PrintYourName{
    public static void main(String []args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name:");

    String name = scanner.nextLine();

    String nameLine = name + name;

    System.out.println("***********************");

    for(int count = 0; count <= 3; count++){

	System.out.println(nameLine);
     
    }

    System.out.println("***********************");
     
  }


}
