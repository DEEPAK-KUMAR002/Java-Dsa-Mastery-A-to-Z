package ch12_Oops;
class Student{
    String name;
    int rollno;
    Student(){
        System.out.println("Constructor is called...");
    }
    Student(String name){
        this.name=name;
    }
    Student(int rollno){
        this.rollno=rollno;
    }
    Student(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }
}
public class tut04_Constructor {
    public static void main(String[] args) {
        //Constructor overloading=polymorphism
        Student s1=new Student("Rohit Sharma");
        System.out.println(s1.name);
        Student s2=new Student();
        Student s3=new Student(21);
        System.out.println(s3.rollno);
        Student s4=new Student("Virat kolhi",18);
        System.out.println(s4.name);
        System.out.println(s4.rollno);
    }
}
