package ch30_Multithreading;
class Mythread1 extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class tut06_current_Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t = Thread.currentThread();
        t.setName("Mera thread");
        System.out.println(Thread.currentThread().getName());

        Mythread1 t1= new Mythread1();
        t1.setName("Child Thread");
        t1.start();
    }
}
