import java.util.Scanner;
public class Temperature{
	public static void main(String []args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the temperature in Celsius:");
	
	double temperature = scanner.nextDouble();
	
	if (temperature <= 0){
	
	System.out.println("Freezing");

	if (temperature >= 0 && temperature <= 15){
	
	System.out.println("Cold");
	
	if (temeperature >= 16 && temperature <= 25){
	
	System.out.println("Warm");
	
	System.out.println("Hot");
	
	}

}