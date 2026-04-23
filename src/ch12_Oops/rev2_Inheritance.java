package ch12_Oops;

public class rev2_Inheritance {
    public static void main(String[] args) {
        rev2_child child= new rev2_child();
        System.out.println(child.car);
        System.out.println(child.cycle);
        child.car = "Tata Nexon";
        child.cycle = "Hero2";
        System.out.println(child.car);
        System.out.println(child.cycle);
        child.showcycle();
        child.showcar();
        System.out.println("\nshow details of child2:");
        rev2_child child2 = new rev2_child();
        child2.showcar();
        child2.showVehicleDetail();
        child2.showcar();
    }
}
