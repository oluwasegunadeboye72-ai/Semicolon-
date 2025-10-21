public class StarDiamond {
    public static void main(String[] args) {
        
	int totalLines = 5;

       
        for (int line = 1; line <= totalLines; line++) {
            
	     int stars; 

             if (line <= 3) {
                 
		 stars = 2 * line - 1;
            
	  } else {
                
	      stars = 2 * (totalLine - line + 1) - 1; 
            
	   }

         for (int s = 0; s < spaces; s++) {
                
	      System.out.print("*");
           }

         for (int star = 0; star < stars; star++) {
                
	      System.out.print("*");
            
	    }

            System.out.println(); 
        }
    }
}