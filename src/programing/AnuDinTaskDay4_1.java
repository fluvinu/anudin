package programing;


public class AnuDinTaskDay4_1 {
    // String Palandrop 
    public static void main(String[] args) {
        String  str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("Yes "+str+" palandrom");
        }else{
            System.out.println("No "+str+" not palandrom");
        }

    }
}