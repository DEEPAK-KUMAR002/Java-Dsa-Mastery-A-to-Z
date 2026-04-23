package ch12_Oops;
class Animal4{
    String Color;
    Animal4(){
        System.out.println("Animal Constructor is Called");
    }
}
class Horse1 extends Animal4{
    Horse1(){
        super.Color="Brown";
//        super();//By default in child class
        System.out.println("Horse Constructor is Called");
    }
    Horse1(String name){
        this();
        System.out.println("Dog named "+ name+" Created");
    }
}
public class tut14_Super_Keyword {
    public static void main(String[] args) {
        Horse1 H1=new Horse1();
        System.out.println(H1.Color);
        Horse1 H2=new Horse1("Buddy");

    }
}
