package ch12_Oops;
abstract class Vehiclei{
    String brand;
    Vehiclei(String brand){
        this.brand = brand;
    }
    abstract void start();
    public void m1(){
        System.out.println("Hello m1");
    }
}
class Thar extends Vehiclei{
    Thar(String brand){
        super(brand);
    }
    @Override
    void start(){
        System.out.println("Starting...");
    }
}
public class tut20_abstractclassdemo {
    public static void main(String[] args){

    }
}
