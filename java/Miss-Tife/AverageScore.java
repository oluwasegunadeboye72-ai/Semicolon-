import java.util.Scanner;
public class AverageScore{
	public static void main(String [] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter attendance percentage:");
	
	double attendance = scanner.nextDouble();

	System.out.print("Enter average Score:");
	
	double averageScore = scanner.nextDouble();

	if (attendance > 75 && averageScore > 75){

	System.out.println("Eligible for exam");
	
	} else {

	System.out.println("Not eligible for exam");
	
	}

}
}

	
	