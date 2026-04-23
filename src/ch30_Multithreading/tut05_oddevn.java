package ch30_Multithreading;
class EvenThread extends Thread{
    @Override
    public void run() {
        for(int i=2;i<=10;i=i+2){
            System.out.println("Even: "+i);
        }
    }
}
class OddThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=9;i=i+2){
            System.out.println("odd: "+i);
        }
    }
}
public class tut05_oddevn {
    public static void main(String[] args) {
        new EvenThread().start();
        new OddThread().start();

    }
}
