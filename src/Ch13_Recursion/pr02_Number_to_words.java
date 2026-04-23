package Ch13_Recursion;

public class pr02_Number_to_words {
        static String[] words = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};

        public static void convertToWords(int n) {
            // Base case
            if (n == 0) {
                return;
            }

            // Recursive call first (to preserve order)
            convertToWords(n / 10);

            // Print the word for the last digit
            System.out.print(words[n % 10] + " ");
        }

        public static void main(String[] args) {
            int number = 1947;
            convertToWords(number);
        }
    }


