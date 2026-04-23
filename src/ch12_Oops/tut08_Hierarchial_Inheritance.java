package ch12_Oops;
class Animal1{
    void Eats(){
        System.out.println("Eats");
    }
    void Breathes(){
        System.out.println("Breathes");
    }
}
class Mammals1 extends Animal1{
    void walk(){
        System.out.println("Walks");
    }
}
class Fish1 extends Animal1{
    void Swim(){
        System.out.println("Swim");
    }
}
class Bird extends Animal1{
    void fly(){
        System.out.println("fly");
    }
}
public class tut08_Hierarchial_Inheritance {
    public static void main(String[] args) {
        Bird B1=new Bird();
        B1.fly();
        B1.Eats();
        B1.Breathes();
        Fish1 F1=new Fish1();
        F1.Swim();
        F1.Eats();
        F1.Breathes();
        Mammals1 M1=new Mammals1();
        M1.walk();
        M1.Eats();
        M1.Breathes();
    }
}
