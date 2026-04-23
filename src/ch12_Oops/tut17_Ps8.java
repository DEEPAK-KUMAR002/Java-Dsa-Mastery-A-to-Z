package ch12_Oops;
class Book{
    int price;
    static int count;//Acess by class name
    public Book(int price){
        this.price = price;
        count++;
    }
}
public class tut17_Ps8 {
    public static void main(String[] args) {
        System.out.print(Book.count+" ");
        Book b1=new Book(150);
        Book b2=new Book(200);
        System.out.println(Book.count);
    }
}
