package ch30_Multithreading.ExecutorseviceDemo;

public class CertifiacationSender implements Runnable{
    private final String studentname;
    public CertifiacationSender(String stdanme){
        this.studentname = stdanme;
    }
    @Override
    public void run() {
        System.out.println("Sending certificate to "+studentname+ " " +
                "by thread "+Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Certifiacte sent to "+studentname+ " " +
                "by thread "+Thread.currentThread().getName());
    }
}
