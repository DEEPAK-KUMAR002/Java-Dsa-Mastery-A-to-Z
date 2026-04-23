package ch00_Pseudo_code;
import java.util.Scanner;
public class tut01_prime_code {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Input the number
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            boolean isPrime = true;
            // Start checking from 2 up to n-1
            for (int div = 2; div < n; div++) {
                if (n % div == 0) {
                    // If divisible, number is not prime
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && n > 1) {
                System.out.println("prime");
            } else {
                System.out.println("NOT prime");
            }
        }
    }

