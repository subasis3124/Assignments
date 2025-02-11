package display;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[] = new int[n];
for(int i = 0; i < n; i++) {
    a[i] = sc.nextInt();
}
int negativesum = 0;
for(int i = 0; i < n; i++) {
    for(int j = i; j < n; j++) {
        int sum = 0;
        for(int k = i; k <= j; k++) {
            if(a[k] < 0){
                sum += a[k]; // Add the negative number to the sum
            }
        }
        negativesum += sum;
    }
}
System.out.println("sum = " + negativesum);
}
}