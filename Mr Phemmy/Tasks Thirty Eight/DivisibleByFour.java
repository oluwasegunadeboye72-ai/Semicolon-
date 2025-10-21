public class DivisibleByFour{
    public static void main(String []args){
        
	int start = 0;
	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number:");
        
	int start = scanner.nextInt();

        System.out.print("Enter the end number:");
        
	int end = scanner.nextInt();

        System.out.println("Numbers divisible by 4 between " + start + " and " + end + ":");

        for (int i = 1; i <= 4; i++) {

	     if (i % 4 == 0){
            
	         System.out.println(i);

              }

          }

      }

  }

         

     



  



	   
