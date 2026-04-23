package ch12_Oops;
class Species{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void Breathe(){
        System.out.println("Breathes");
    }
}
class Mammals extends Species{
    int legs;
}
class Dog extends Mammals{
    String breed;
}
public class tut07_Multilevel_Inheritance {
    public static void main(String[] args) {
        Dog Doggy = new Dog();
        Doggy.eat();
        Doggy.Breathe();
        Doggy.legs=4;
        Doggy.color="Red";
        Doggy.breed="Pitgul";
        System.out.println("Doggy legs is :"+Doggy.legs);
        System.out.println("Doggy color is :"+Doggy.color);
        System.out.println("Doggy bread is :"+Doggy.breed);
    }
}
