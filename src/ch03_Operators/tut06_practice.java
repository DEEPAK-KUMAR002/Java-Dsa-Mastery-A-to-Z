package ch03_Operators;

public class tut06_practice {
    public static void main(String[] args) {
//        int x = 2, y = 5;
//        //left to right
//        int exp1 = (x * y / x);//2*5/2=5
//        int exp2 = (x * (y / x));//2*(5/2)=4
//        System.out.print(exp1 + " , ");
//        System.out.print(exp2);


//        int x = 200, y = 50, z = 100;
//
//        if (x > y && y > z)//T && F
//        {
//            System.out.println("Hello");
//        }
//        if ((z > y) && (z < x))//true && true
//        {
//            System.out.println("Java");
//        }
//        if ((y + 200) < x && (y + 150) < z) //false && false
//        {
//            System.out.println("Hello Java");
//        }
//        //output:Java


//        int x, y, z;
//        x = y = z = 2;
//        x += y;//x=4
//        y -= z;//y=0
//        z /= (x + y);//2/4=0
//        System.out.println(x + " " + y + " " + z);

//        int x = 9, y = 12;
//        int a = 2, b = 4, c = 6;
//        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
//        //4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a) / (a + b*y);
//        //4/3 * (x + 34) + 9 * (2 + 24) + (3+48) / (a + 48);
//        //4/3 * (43) + 9 * (26) + (51) / 50;
//        //1 * (43) + 9 * (26) + (51) / 50;
//        // (43) + 234 + 1;
//        // 278
//        System.out.println(exp);

        

        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        //(y * (x / y + x / y));
        //(5 * (10 / 5 + 10 / 5));
        //( 5* (4));
        //20
        int exp2 = (y * x / y + y * x / y);
        //(y * x / y + y * x / y);
        //(5 * 10 / 5 + 5 * 10 / 5);
        //( 50/5 + 50/5)
        //( 10+10)
        //20
        System.out.println(exp1);
        System.out.println(exp2);

         

    }
}
