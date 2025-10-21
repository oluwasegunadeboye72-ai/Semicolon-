import java.util.Scanner;
public class WeatherScientist {
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a Celsius temperature: ");
        int celsius = scanner.nextInt();

	if (celsius < -273) {
            
	    System.out.println("Invalid temperature! Below absolute zero.");
        
	} else {
            
            for (int i = 0; i < 5; i++) {
                
		int currentCelsius = celsius + i;
                
		double fahrenheit = (currentCelsius * 9.0 / 5) + 32;
                
		System.out.printf("%d°C = %.1f°F%n", currentCelsius, fahrenheit);

             }

          }

       }

    }