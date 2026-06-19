package ch24_Hashing;

import java.util.HashMap;

public class tut01_basic {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        //Insert - 0(1)
        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);
        System.out.println(hm);

        //Get - 0(1)
        System.out.println(hm.get("a"));
        System.out.println(hm.get("b"));

        //ContainsKey - 0(1)
        System.out.println(hm.containsKey("a"));
        System.out.println(hm.containsValue("b"));
        System.out.println(hm.containsValue("d"));

        //remove
        System.out.println(hm.remove("a"));
        System.out.println(hm);
        System.out.println(hm.remove("d"));
        System.out.println(hm);

        //Size
//        System.out.println(hm.size());
//
//        hm.clear();
//        System.out.println(hm.isEmpty());
    }
}
