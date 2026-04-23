package ch10_Strings;

public class tut09_LargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};
        String largest = fruits[0];//a < b < m
        for(int i=1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
