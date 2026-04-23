package ch12_Oops;
class Vehicle1{
    void print(){
        System.out.println("Base Class(Vehicle)");
    }
}
class Car1 extends Vehicle1{
    void print1(){
        System.out.println("Derived class(Car)");
    }
}
public class tut16_Ps6 {
    public static void main(String[] args) {
        Vehicle1 obj1=new Car1();
//        obj1.print1();//variable obj1 of type ch12_Oops.Vehicle1
    }
}
