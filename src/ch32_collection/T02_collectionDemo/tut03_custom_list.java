package ch32_collection.T02_collectionDemo;


import java.util.ArrayList;
import java.util.List;

class Student{
    int id;
    String name;
    String course;
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
public class tut03_custom_list {
    public static void main(String[] args) {
        Student s1=new Student(1,"Arjun","Java");
        Student s2=new Student(2,"Abhishek","Dsa");
        Student s3=new Student(3,"Nilesh","Devops");

        List<Student> studentlist=new ArrayList<>();
        studentlist.add(s1);
        studentlist.add(s1);
        studentlist.add(s1);
        System.out.println(studentlist);
    }
}
