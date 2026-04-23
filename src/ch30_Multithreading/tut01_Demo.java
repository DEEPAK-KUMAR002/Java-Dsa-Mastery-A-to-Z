package ch30_Multithreading;

class MyRunthread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread");
        }
    }
}

public class tut01_Demo {
    public static void main(String[] args) {
    MyRunthread t = new MyRunthread();
    t.start();
//    t.run(); --> No Multithreading
    for(int i=0;i<5;i++){
        System.out.println("Main");
    }
    }
}
