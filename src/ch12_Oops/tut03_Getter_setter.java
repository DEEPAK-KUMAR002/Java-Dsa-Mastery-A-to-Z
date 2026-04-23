package ch12_Oops;
class Pens{
    private String color;
    private int tip;
    void setColor(String color){
        this.color=color;
    }
    String getColor() {
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setTip(int tip){
        this.tip=tip;
    }
}
public class tut03_Getter_setter {
    public static void main(String[] args) {
        Pens p1=new Pens();
        p1.setTip(5);
        p1.setColor("Red");
        System.out.println(p1.getTip());
        System.out.println(p1.getColor());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}
