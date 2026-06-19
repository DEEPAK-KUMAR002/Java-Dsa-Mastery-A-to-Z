package ch24_Hashing;

import java.util.HashMap;
import java.util.Set;

public class tut02_keySet {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 200);
        hm.put("USA", 300);
        hm.put("Japan", 400);
        hm.put("Nepal", 500);


        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key="+k+ ",value="+hm.get(k));
        }
    }
}
