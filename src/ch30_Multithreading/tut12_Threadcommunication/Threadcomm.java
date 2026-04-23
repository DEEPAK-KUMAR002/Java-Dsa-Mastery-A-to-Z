package ch30_Multithreading.tut12_Threadcommunication;

public class Threadcomm {
    public static void main(String[] args) throws InterruptedException{
        ThreadA a1=new ThreadA();
        a1.start();
        synchronized (a1){
            System.out.println("Main Thread calling wait()");
            a1.wait();
            System.out.println("Main thread get notify...");
            System.out.println("Total :"+a1.total);
        }
    }
}
class ThreadA extends Thread{
    int total=0;
    @Override
    public void run() {
        synchronized (this){
            System.out.println("Child Thread start calling...");
            for(int i=0;i<=100;i++){
                total=total+i;
            }
            this.notify();
            System.out.println("Child Thread giving notification...");
        }
    }
}