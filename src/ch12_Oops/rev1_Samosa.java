package ch12_Oops;

public class rev1_Samosa {
    //properties
    private String shape;
    private String color;
    private String type;
    private int price;
    //constructor
    public rev1_Samosa(){
        shape= "Triangular";
        color = "Yellowish";
        type = "Aloo Samosa";
        price = 10;
        System.out.println("Default Samosa created");
    }
    public rev1_Samosa(String shape,String color,String type,int price){
        this.shape = shape;
        this.type = type;
        this.color = color;
        this.price = price;
        System.out.println("Samosa Created");
    }
    //behaviours
    public void showdetails(){
        System.out.println("+++++++++++");
        System.out.println("shape:"+shape);
        System.out.println("color:"+color);
        System.out.println("Type"+type);
        System.out.println("Price:"+price);
    }
}
