package ch30_Multithreading;

class Mytask implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable ...");
    }
}
public class tut04_Runnable {
    public static void main(String[] args){
        Thread t= new Thread(new Mytask());
        t.start();
    }
}

