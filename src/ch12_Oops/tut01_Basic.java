package ch12_Oops;

class Pen{
    String color;
    int tip;
    Pen(){
        System.out.println("Constructor call");
    }
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
public class tut01_Basic {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.color = "Yellow";
        System.out.println(p1.color);
        p1.setTip(7);
        System.out.println(p1.tip);
    }
}
