//Write a program to take in 10 values and print only those nos which are prime.
import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int a[] = new int[10];

        // Input
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Check for prime numbers
        for (int i = 0; i < a.length; i++) {
            int j = 2; // Start from 2 as 0 and 1 are not prime
            int p = 1;

            if (a[i] <= 1) {
                p = 0;
            } else {
                while (j <= Math.sqrt(a[i])) {
                    if (a[i] % j == 0) {
                        p = 0;
                        break;
                    }
                    j++;
                }

                if (p == 1) {
                    System.out.println(" " + a[i]);
                }
            }
        }
    }
}
