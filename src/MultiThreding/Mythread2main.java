package MultiThreding;

// with help on interface 
class Mythread implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("thread is running ");
        for(int i =0;i<5;i++){
            System.out.println(i);
        }
    }
    
}


public class Mythread2main {

    public static void main(String[] args) {
        Mythread t2=new Mythread();
        Thread t3=new Thread(t2);
        t3.start();
        System.out.println("main thred is runing");
    }

    
}
