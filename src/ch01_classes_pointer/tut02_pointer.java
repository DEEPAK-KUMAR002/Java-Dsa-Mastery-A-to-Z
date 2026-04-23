package ch01_classes_pointer;

import java.util.HashMap;

public class tut02_pointer {
    public static void main(String[] args) {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        map1.put("Value",11);
        map2 = map1;
        map1.put("Value",22);
        System.out.println(map1);
        System.out.println(map2);

    }
}
