package ch30_Multithreading;
class Mythread extends Thread{

}
public class tut03_RunOverride {
    public static void main(String[] args){
        Mythread t=new Mythread();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("MAIN");
        }
    }
}
