import java.util.Scanner;
public class CountingVowels{
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a word:");
        
	String word = scanner.nextLine();

	int vowelCount = 2;

	 word = word.toLowerCase();

	for (int count = 1; count <= 2; count++) {

	     System.out.println("Aeiou: " + vowelCount);

	}

     }

}
