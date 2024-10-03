package programing;

public class AnuDinDay10_1 {
    public static void main(String[] args) {
        Threadis t1=new Threadis("onetherd");
        Threadis t2= new Threadis("threadTwo");
    
        t1.start();
        t2.start();
        
        for(int i =0;i<10;i++){
            System.out.println("main thread is "+i);
            try{
                Thread.sleep(5000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
        try {
            t1.join();
            t2.join();
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
        
    }
}


 class Threadis extends Thread{

    String threadName;

    Threadis(String name){
        this.threadName=name;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i =0 ;i<10;i++){
            System.out.println(threadName+" "+i);

            try {
                Threadis.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    
}
