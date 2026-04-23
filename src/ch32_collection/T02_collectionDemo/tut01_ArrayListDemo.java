package ch32_collection.T02_collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class tut01_ArrayListDemo {
    public static void main(String[] args) {
        //order
        //Duplicate
        //Index access
        List<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(10);
        nums.add(20);
        System.out.println(nums);
        System.out.println(nums.get(3));
        System.out.println(nums.size());
        if(nums.isEmpty()){
            System.out.println("List Empty...");
        }
        else{
            System.out.println("Non Empty...");
        }
        nums.add(3,90);
        System.out.println(nums);
    }
}
