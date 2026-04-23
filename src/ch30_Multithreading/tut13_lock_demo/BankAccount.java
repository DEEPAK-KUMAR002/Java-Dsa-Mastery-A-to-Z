package ch30_Multithreading.tut13_lock_demo;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int bal = 1000;
    private final ReentrantLock r1 = new ReentrantLock();
    public void withdraw(String threadName, int amount){
        System.out.println(threadName+ " is trying to withdrawn "+amount );
//        r1.lock();
        if(r1.tryLock()){
        try{
            r1.lock();
            System.out.println(threadName+ " acquired lock");
            if(bal >= amount){
                Thread.sleep(2000);
                bal = bal - amount;
                System.out.println("Withdrawn :"+amount+ "remaining :"+bal);
            }
            else {
                System.out.println("Insufficent balance");
            }
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        finally {
            r1.unlock();
        }
    }
    else{
            System.out.println(threadName+" let me some other task...");
    }
    }
}
