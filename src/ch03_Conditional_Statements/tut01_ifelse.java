package ch03_Conditional_Statements;

public class tut01_ifelse {
    public static void main(String[] args) {
        int age=16;
        if(age>=18){
            System.out.println("Adult: drive,vote");
        }
        if(age>13 && age <18){
            System.out.println("teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}
