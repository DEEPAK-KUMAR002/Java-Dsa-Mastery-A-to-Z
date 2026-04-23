package ch12_Oops;
class Student1{
    String name;
    int rollno;
    String password;
    int marks[];
    //Shallow Copy constructor
//    Student1(Student1 s1){
//        marks=new int[3];
//        this.name=s1.name;
//        this.rollno=s1.rollno;
//        this.marks=s1.marks;
//        this.password = s1.password;
//    }

    //Deep Copy Constructor
    Student1(Student1 s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        this.password = s1.password;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    Student1(){
        marks=new int[3];
        System.out.println("Default constructor");
    }
}
public class tut05_Copy_Constructor {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.name="Deepak";
        s1.rollno=21;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=98;
        s1.marks[2]=90;
        Student1 s2=new Student1(s1);
        s1.password="xyz";
        s1.marks[2]=95;//string is immutable
        s1.rollno = 71;
        System.out.println("print student s2 marks:");
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println("print student s1 marks:");
        for(int i=0;i<3;i++){
            System.out.println(s1.marks[i]);
        }
        System.out.println("student s2 name is :"+s2.name);
        System.out.println("student s2 rollno is :"+s2.rollno);
        System.out.println("student s2 password is :"+s2.password);

        System.out.println("student s1 name is :"+s1.name);
        System.out.println("student s1 rollno is :"+s1.rollno);
        System.out.println("student s1 password is :"+s1.password);
    }
}
