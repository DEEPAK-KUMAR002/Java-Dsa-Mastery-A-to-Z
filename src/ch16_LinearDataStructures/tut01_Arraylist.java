package ch16_LinearDataStructures;
import java.util.ArrayList;
//import java.util.*    //for all
public class tut01_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> List1=new ArrayList<>();
        ArrayList<String> List2=new ArrayList<>();
        ArrayList<Boolean> List3=new ArrayList<>();
        List1.add(1); // Tc=0(1)
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(1,9); //0(n)
        System.out.println(List1);
        //Get Operation
        int element = List1.get(2);// Tc=0(1)
        System.out.println(element);
        //Remove operation
        List1.remove(2);
        System.out.println(List1);
        //set element at index
        List1.set(2,10);
        System.out.println(List1);
        //Contains Element
        System.out.println(List1.contains(1));
        System.out.println(List1.contains(11));
        System.out.println(List1.get(3));
        //Size of Arraylist
        System.out.println(List1.size());
        //print the arraylist
        for(int i=0;i<List1.size();i++){
            System.out.print(List1.get(i)+" ");
        }
    }
}
