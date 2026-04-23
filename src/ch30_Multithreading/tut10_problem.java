package ch30_Multithreading;
class Addition{
    int sum =0;
//    synchronized  public void add(){//Synchronized method
    public void add(){
        synchronized (this) {//Synchronized block
            sum = sum + 1;
        }
    }
}
class Mythread3 extends Thread {
    Addition add;
    Mythread3(Addition add){
        this.add = add;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            add.add();
        }
    }
}
class Mythread4 extends Thread {
    Addition add;
    Mythread4(Addition add){
        this.add = add;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            add.add();
        }
    }
}
public class tut10_problem {
    public static void main(String[] args){
        Addition addition=new Addition();
        Mythread3 t3=new Mythread3(addition);
        Mythread4 t4=new Mythread4(addition);
        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Final sum :"+addition.sum);
    }
}
