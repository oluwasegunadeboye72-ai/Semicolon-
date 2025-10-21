public class SpecialNumberAdder {
    public static void main(String[] args) {
        
	int total = 0; 

       for (int number = 1; number <= 50; number++) {
            
            if (number % 3 == 0 || number % 5 == 0) {
                total += number; 
            }
        }

        
        System.out.println("Total of numbers divisible by 3 or 5 from 1 to 50: " + total);

     }

  }


