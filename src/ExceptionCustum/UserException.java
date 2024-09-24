package ExceptionCustum;


class CustumExeption extends  Exception {

    CustumExeption(String msg){
        super(msg);
    }    
}

public class  UserException {
    
    public static void main(String[] args) {
        // UserException u1=new UserException();
        // u1.valiateAge(23);
        new UserException().valiateAge(8);
    }

     void valiateAge(int age){
        if(age<18){
            try {
                throw new CustumExeption("invalid age");
            } catch (CustumExeption e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            System.out.println("ok youare validtaed");
        }
    }
    
}
