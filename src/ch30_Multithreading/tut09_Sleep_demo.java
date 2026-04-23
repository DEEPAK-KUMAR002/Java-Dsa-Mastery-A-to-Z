package ch30_Multithreading;
class SleepThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            System.out.println(getName()+"---"+i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Thread Intrerupted");
            }
        }
    }
}
public class tut09_Sleep_demo {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        SleepThread s1 = new SleepThread();
        s1.setName("child");
        s1.start();
    }
}
