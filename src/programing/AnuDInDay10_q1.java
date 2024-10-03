package programing;

public class AnuDInDay10_q1 {
    public static void main(String[] args) {
        Thread1 t1=new Thread1("iamThread1");
        Thread1 t2=new Thread1("iamthredf2");
        t1.start();
        // t2.start();
        try{
            t1.join();
            // t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}

class Thread1 extends Thread{
    private String threadName;

    Thread1(String name ){
        this.threadName=name;
    }

    @Override
    public void run() {
        for(int i=0;i<=4;i++){
            System.out.println(threadName+"  "+i);
            try {
                Thread1.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}