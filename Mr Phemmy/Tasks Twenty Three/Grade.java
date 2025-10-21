import java.util.Scanner;
public class Grade{
    public static void main(String []args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter your test score (0 to 100):");

	int score = scanner.nextInt();

	if(score < 0 && score > 100){

	   System.out.println("Invalid score. please enter a score between 0 and 100.");

	} else{


	    String grade;

	    switch (score /10){

		case 10:
		case 9:
		
		    grade = "A!";

		case 8:

		    grade = "B!";

		case 7:
		    
		    grade = "C!";

		default:

		    grade = "F!";

		}

		System.out.println("Grade: " + grade);

	   
           }

      }


}