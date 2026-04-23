package ch12_Oops;
class Animal2{
    void eat(){
        System.out.println("Eats Anything");
    }
}
class Deer extends Animal2{
    @Override
    void eat(){
        System.out.println("eats Grasses");
    }
}
public class tut10_Method_Overriding {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();//eats Grasses
    }
}
