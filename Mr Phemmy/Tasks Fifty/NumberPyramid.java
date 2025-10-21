public class NumberPyramid {
    public static void main(String[] args) {
        
        for (int line = 1; line <= 4; line++) {
            
            for (int count = 1; count <= line; count++) {
                
		System.out.print(line + " ");
            }
            System.out.println(); 
        }
    }
}