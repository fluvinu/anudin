

public class mamCode{

public static void printPattern(int n){
    
        int i, j;
        // outer loop to handle number of rows
        for (i = 0; i < n; i++) {
           
            for (j = 0; j < n; j++) {
                
                if (i == 0 || j == 0 || i == n -1 // -1 is a mistake
                    || j == n -1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
            
        }
    }
    System.out.println(); // move hear 
}
    }



public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }



}