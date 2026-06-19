package ch30_Multithreading;
class myth extends Thread{

}
public class tut03_RunOverride {
    public static void main(String[] args){
        myth t=new myth();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("MAIN");
        }
    }
}
