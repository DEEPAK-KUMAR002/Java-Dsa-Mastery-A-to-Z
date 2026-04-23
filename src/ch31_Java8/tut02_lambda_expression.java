package ch31_Java8;
public class tut02_lambda_expression {
    public static void main(String[] args){
//    Runnable task = ()-> System.out.println("Hello task");
    Runnable task = ()-> {
        for(int i=0;i<5;i++) {
            System.out.println("Hello task");
        }
    };
    new Thread(task).start();
    for(int i=0;i<5;i++) {
        System.out.println("main...");
    }
    }
}
