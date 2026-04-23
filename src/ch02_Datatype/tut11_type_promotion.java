package ch02_Datatype;

public class tut11_type_promotion {
    public static void main(String[] args) {
        char a='a';
        char b='b';
        // char c=b-a;//possible lossy conversion from int to char
        int d=b-a;
        System.out.println((int)(a));
        System.out.println((int)b);
        System.out.println(b-a);
        // System.out.println(c);
        System.out.println(d);

        short p=5;
        byte q=25;
        char r='c';
        // byte bt=p+q+r;//possible lossy conversion from int to byte
        // System.out.println(bt);
        int i=p+q+r;
        System.out.println(i);//5+25+100

        int x=10;
        float y=20.25f;
        long z=25;
        double k=30;
        double ans=x+y+z+k;
        // int ans1=x+y+z+k; //lossy conversion from double to int
        System.out.println(ans);
        // System.out.println(ans1);

        byte b1=5;
        byte a1=(byte)(b1*2);
        System.out.println(a1);
    }
}
