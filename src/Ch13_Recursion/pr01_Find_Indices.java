package Ch13_Recursion;

public class pr01_Find_Indices {
    public static void findOccurrences(int[] arr, int key, int index) {
        // Base case
        if (index == arr.length) {
            return;
        }

        // Check current element
        if (arr[index] == key) {
            System.out.print(index + " ");
        }

        // Recursive call for next index
        findOccurrences(arr, key, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        findOccurrences(arr, key, 0);
    }
}
