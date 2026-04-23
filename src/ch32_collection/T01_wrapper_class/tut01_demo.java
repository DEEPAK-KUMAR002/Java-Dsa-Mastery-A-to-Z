package ch32_collection.T01_wrapper_class;

public class tut01_demo {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(20);//wrapper object
        Integer i2 = Integer.valueOf(120);//wrapper object
        System.out.println(i);
        System.out.println(i2+"\n");


        int obj1 = Integer.parseInt("2323");
        boolean atrue = Boolean.parseBoolean("true");
        System.out.println(obj1+10);
        System.out.println(atrue+"\n");

        Double d = 9.88;
        int i3 = d.intValue();
        System.out.println(i3+"\n");

        Integer k=66;
        String ks = k.toString();
        System.out.println(ks+"\n");

        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a==b);
        System.out.println();
        Integer a1 = 100;
        Integer b1 = 100;
        System.out.println(a1==b1);
        //Note :Java caches Integer objects from –128 to 127.
        //100 falls in this range, so both variables refer to the same cached
        // object.
        System.out.println();
        Integer pa = 128;
        Integer pb = 128;
        System.out.println(pa.equals(pb));
        //contact compaire karega.
    }
}
