package ExceptionHandel;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("Result: " + c);
            } catch (ArithmeticException e) {
                // System.out.println("Error: " + e.getMessage());
                // System.out.println("Error: " + e.toString());
                // System.out.println("Error: " + e.getStackTrace());
                // System.out.println("Error: " );
                
                }finally{
                    System.out.println("Program ended");
                }
    }
}
