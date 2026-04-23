package ch12_Oops;

public class rev2_child extends rev2_parents {
    String cycle = "Hero";
    String car = "BMW";
    public void showcycle(){
        System.out.println(cycle);
    }
    public void showVehicleDetail(){
        System.out.println("Printing all vehicle detail:");
        System.out.println(cycle);
        System.out.println(this.car);
        System.out.println(super.car);
    }
    public void showcar(){ //Overriding
        System.out.println("showing our own new car:");
        System.out.println(this.car);
    }
}
