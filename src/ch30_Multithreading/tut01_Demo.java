package ch30_Multithreading;

class Mythread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread");
        }
    }
}

public class tut01_Demo {
    public static void main(String[] args) {
    Mythread t = new Mythread();
//    t.start();
    t.run(); // No multiThreading
    for(int i=0;i<5;i++){
        System.out.println("Main");
        }
    }
}
