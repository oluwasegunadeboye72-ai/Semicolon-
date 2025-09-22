import java.util.Scanner;
public class NegativeNumber{
	public staic void main(String [] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter an ineger:");
	
	int number = Scanner.nextInt();

	if(number ==0){
	
	System.out.println("Zero");
	
	} else if(number > 0){
	
	if(number % 2 == 0){
	
	System.out.println("Positive Even");

	} else{

	System.out.println("Positive Odd");

	} else{

	if(number % 2 == 0){

	System.out.println("Negative Odd");
	
}
}