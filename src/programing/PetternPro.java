package programing;

public class PetternPro {
	
//    1
//  2  2
//3  3  3
//4  4  4  4
//5  5  5  5  5

    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i);
            }
            System.out.println(); 
        }
    }
}

