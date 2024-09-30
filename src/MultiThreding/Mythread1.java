package MultiThreding;
// extent thread 
 class ThredDemo extends Thread {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("first thread is running ");
    }
}

public class Mythread1 {
    //object cration
    public static void main(String[] args) {
        Thread t1=new ThredDemo();
        t1.start();
        System.out.println("main thread runing ");
    }
    
}
