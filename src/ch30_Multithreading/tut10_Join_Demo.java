package ch30_Multithreading;
class JoinThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        }
    }
}
public class tut10_Join_Demo {
    public static void main(String[] args) throws InterruptedException{
        JoinThread t1=new JoinThread();
        t1.start();
        t1.join(); //main - Jo line execute karega wahi wait karega
        for(int i=0;i<3;i++){
            System.out.println("Main thread");
        }
    }
}
