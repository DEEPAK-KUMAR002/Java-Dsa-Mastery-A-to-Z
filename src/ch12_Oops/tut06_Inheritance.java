package ch12_Oops;
class Animal{
    String Color;
    public Animal(){
        Color = "Brown";
    }
    void eat(){
        System.out.println("Eats");
    }
    void Breath(){
        System.out.println("Breathes");
    }
    public void showcolor(){
        System.out.println("Animal color is : "+Color);
    }
}
class Fish extends Animal{
    int fins;
    String Color = "Red";
    public Fish(){
        fins = 4;
    }
    void Swim(){
        System.out.println("Swims in water");
    }
    public void showfins(){
        System.out.println("Number of fish's fins:"+fins);
    }
    public void showdetails(){
        System.out.println("Number of fish's fins:"+fins);
        System.out.println("Fish color is :"+ Color);
        System.out.println("Fish color is :"+ super.Color);
        System.out.println("Fish color is :"+ this.Color);
    }
}
public class tut06_Inheritance {
    public static void main(String[] args) {
        Fish Shark=new Fish();
        Shark.eat();
        System.out.println(Shark.Color);
        System.out.println(Shark.fins);
//        Shark.Color = "Black";
//        Shark.fins = 2;
        System.out.println(Shark.Color);
        System.out.println(Shark.fins);
        Shark.showcolor();
        Shark.showfins();
        Shark.showdetails();

    }
}
