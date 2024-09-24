package programing;

public class AnuDinTaskDay3_Sac1_1 {
    public static void main(String[] args) {
        // strong no where its factorial of each digit are similar to that number 
        // range 
        int  a = 1;
        int b = 1000000;
        for(int i = a; i < b; i++){
            int sum = 0;
            int temp = i;
            while(temp != 0){
                int r = temp % 10;
                int fact = 1;
                for(int j = 1; j <= r; j++){
                    fact *= j;
                }
                sum += fact;
                temp /= 10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
