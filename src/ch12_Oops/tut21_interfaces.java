package ch12_Oops;
interface Animali{
    void makesound();
    void eat();
}
class Dogi implements Animali{
    @Override
    public void makesound(){
        System.out.println("Dog bark");
    }
    @Override
    public void eat(){
        System.out.println("milk roti");
    }
}
public class tut21_interfaces {
    public static void main(String[] args){
        Animali dog =new Dogi();
        dog.eat();
        dog.makesound();
    }
}
