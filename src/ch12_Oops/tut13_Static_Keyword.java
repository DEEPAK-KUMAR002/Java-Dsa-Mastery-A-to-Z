package ch12_Oops;
class Student2{
    static Float returnCgpa(Float Sgpa1,Float Sgpa2,Float Sgpa3,Float Sgpa4){
        return (Sgpa1+Sgpa2+Sgpa3+Sgpa4)/4.0f;
    }
    String name;
    int roll;
    static String schoolName;
    public int getRoll() {
        return this.roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class tut13_Static_Keyword {
    public static void main(String[] args) {
        Student2 s1=new Student2();
        System.out.println(Student2.returnCgpa(7.85f,7.11f,7.14f,7.73f));
        s1.schoolName="JMV";
        Student2 s2=new Student2();
        s1.schoolName="Rs";
        Student2 s3=new Student2();
        System.out.println(s2.schoolName);
    }
}
