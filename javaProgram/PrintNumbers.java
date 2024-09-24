public class PrintNumbers {

    public static void main(String[] args) {
        printNumbers('a' / 'a', 'd'); 
    }

    
    public static void printNumbers(int current, int end) {
        if (current > end) {
            return;
        }
        System.out.println(current);
        printNumbers(current + 1, end);
    }
}
