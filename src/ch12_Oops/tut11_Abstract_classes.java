package ch12_Oops;
abstract class Animal3{
    String color;
    Animal3(){
        System.out.println("Animal Construtor called");
        color = "brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal3{
    Horse(){
        System.out.println("Horse Constructor Called");
    }
    void changeColor(){
        color = "Dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal3{
    Chicken(){
        System.out.println("Chicken Constructor Called");
    }
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor Called");
    }
}
public class tut11_Abstract_classes {
    public static void main(String[] args) {
        Mustang M=new Mustang();
        System.out.println();
        Horse H = new Horse();
        H.eat();
        H.walk();
        System.out.println("Horse color is :"+H.color);
        H.changeColor();
        System.out.println("Horse color is :"+H.color);
        Chicken C = new Chicken();
        C.eat();
        C.walk();
        System.out.println("Chicken color is :"+C.color);
        C.changeColor();
        System.out.println("chicken color is :"+C.color);
    }
}
