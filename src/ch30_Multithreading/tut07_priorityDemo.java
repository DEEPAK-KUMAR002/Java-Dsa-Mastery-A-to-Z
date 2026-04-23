package ch30_Multithreading;

class Mythraed2 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
        //default priority = 5
    }
}
public class tut07_priorityDemo {
    public static void main(String[] args){
        Mythraed2 t2 = new Mythraed2();
        t2.setName("Thread-t2");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
    }
}
