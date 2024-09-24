package ExceptionCustum;

public class UpiExmple {
    static int a=1243;
    public static void main(String[] args) throws CustumExeption {
        if(a==123){
            System.out.println("Payment Is Done");
        }else{
            throw new CustumExeption("its custum exception of upi pin");
        }
    }
}
