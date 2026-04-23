package ch30_Multithreading.ExecutorseviceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(8);
        String []studentlist = {
                "Riya","raj","Ashu","Aman","Sachin","Sunny",
                "Ankit","Adarsh","Rohit","Archana","shashank","Sagar","Anju","Saurabh"
        };
        for(String student:studentlist){
            CertifiacationSender task = new CertifiacationSender(student);
            service.submit(task);
        }
        service.shutdown();
    }
}
