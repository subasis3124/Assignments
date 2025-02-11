package display;

import java.util.Scanner;

public class HA1Q5ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values for W, G, K, A:");
        int W = scanner.nextInt();
        int G = scanner.nextInt();
        int K = scanner.nextInt();
        int A = scanner.nextInt();

        System.out.println("Before exchange:");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

        W = W + A; 
        A = W - A; 
        W = W - A; 

        G = G + K; 
        K = G - K; 
        G = G - K;

        System.out.println("\nAfter exchange:");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

	


	}

}
