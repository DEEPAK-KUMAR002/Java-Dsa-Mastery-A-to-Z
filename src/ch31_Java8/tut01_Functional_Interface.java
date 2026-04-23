package ch31_Java8;

@FunctionalInterface
interface Calsy {
    int add(int a,int b);
}
class child implements Calsy{
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
public class tut01_Functional_Interface{
    public static void main(String[] args){
        Calsy add = (a,b) -> a+b;
        System.out.println(add.add(5,5));
    }
}