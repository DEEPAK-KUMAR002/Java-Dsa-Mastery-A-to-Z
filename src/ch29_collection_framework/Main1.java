package ch29_collection_framework;

import java.util.*;

public class Main1 {
    public static void main(String[] args){
        //homo - Same type of element
        List<String> names = new ArrayList<>();
        names.add("Arav");
        names.add("Sumit");
//        names.add(23); //error
        names.add("Sandeep");
        names.add("Arman");
        names.add("Arav");
//        for(String name:names){
//            System.out.println(name);
//        }

//        names.forEach(item ->{
//            System.out.println(item);
//        });

        names.forEach(System.out::println);
        System.out.println(names.get(0));
        System.out.println(names.size());

        //hetro - different types of element
//        List names1 = new ArrayList<>();
//        names1.add("Ravi");
//        names1.add("Kajol");
//        names1.add(23);
//        names1.add(23.456);

        System.out.println("------------");
        Set<String> nameset = new HashSet<>();
        nameset.addAll(names);
        nameset.forEach(item -> System.out.println(item));

        System.out.println("--------------");
        Map<String,Integer> FriendsAge = new HashMap<>();
        FriendsAge.put("Kamal",35);
        FriendsAge.put("Pramod",20);
        FriendsAge.put("Irfan",10);
        FriendsAge.put("Irfan",50);//update value //No duplicate

        System.out.println(FriendsAge.get("Kamal")); //key --> value return
        FriendsAge.forEach((key,value)-> System.out.println(key+"->"+value));

        Set<String> strings = FriendsAge.keySet();
        Collection<Integer> values = FriendsAge.values();
    }
}
