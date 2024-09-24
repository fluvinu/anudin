package programing;

public class AnuDinTaskDay3_Sac1_2 {
    // leap year 
    public static void main(String[] args) {
    int a=1;
    int b=2024;
    for(int i=a;i<=b;i++){
        if(i%4==0 && i%100!=0 || i%400==0){
            System.out.println(i+" is a leap year");
        }
    }
    }
}
