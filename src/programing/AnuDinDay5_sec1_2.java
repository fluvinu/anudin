package programing;

public class AnuDinDay5_sec1_2 {
        public static void main(String[] args) {
          
            int[] numbers = {0, 1, 2, 3, 4};
    
          
            for (int i = 0; i <= numbers.length; i++) { // Note the condition is <=
                try {
                    System.out.println("Accessing index " + i + ": " + numbers[i]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    // Catch the exception and print a message
                    System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
                }
            }
        }
    }
    

