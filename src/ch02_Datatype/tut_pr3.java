package ch02_Datatype;

import java.util.Scanner;

public class tut_pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Total bill (without GST): " + total);
        float gst = total * 0.18f;
        float totalWithGst = total + gst;
        System.out.println("Total bill (with 18% GST): " + totalWithGst);
    }
}
