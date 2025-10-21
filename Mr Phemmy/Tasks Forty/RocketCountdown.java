public class RocketCountdown {
    public static void main(String[] args) {
        int countdown = 20; 

        while (countdown >= 10) {
            System.out.println(countdown); 

         
            if (countdown == 15) {
                System.out.println("Halfway!");
            }

            countdown--; 
        }
    }
}