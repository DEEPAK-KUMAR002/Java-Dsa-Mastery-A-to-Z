package ch30_Multithreading;
class Mythread5 extends Thread{
    TablePrintWithMethod t;
    Mythread5(TablePrintWithMethod t){
        this.t = t;
    }
    @Override
    public void run() {
        t.printTable(5);
    }
}
class TablePrintWithMethod {
//    public synchronized void printTable(int n){
    public void printTable(int n){
        synchronized (this){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+(n*i));
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        }
    }
}
public class tut11_TablePrintWithMethod {
    public static void main(String[] args){
        System.out.println("Sync method ......");
        TablePrintWithMethod t = new TablePrintWithMethod();
        Thread t1=new Mythread5(t);
        Thread t2=new Mythread5(t);
        t1.setName("t1-thread");
        t2.setName("t2-thread");
        t1.start();
        t2.start();
        try{
            System.out.println("Main thread waiting...");
            t1.join();
            t2.join();
            System.out.println("Main thread completed");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    }


