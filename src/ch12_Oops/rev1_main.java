package ch12_Oops;

public class rev1_main {
    public static void main(String[] args) {
        System.out.println("Going to create samosas");
        rev1_Samosa s1 = new rev1_Samosa();
        s1.showdetails();
        rev1_Samosa s2 = new rev1_Samosa("panchmuki","Red","Mix",100);
        s2.showdetails();
    }
}
