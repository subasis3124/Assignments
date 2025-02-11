package display;

import java.util.Scanner;

public class HA1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value for w,g,k,a");
		int w = scanner.nextInt();
		int g = scanner.nextInt();
		int k = scanner.nextInt();
		int a = scanner.nextInt();
		
		System.out.println("\n Before swapping: ");
		System.out.println("W = " + w + " , g = " + g + " , k = " + k + " , a = " + a );
		
		int t =g;
		g=k;
		k=a;
		a=w;
		w=t;

		
		System.out.println("\nafter swapping with extra varriables:");
		System.out.println("w = " + w + ", g = " + g  + ", k = " + k + ", a = " + a);
		
		
		scanner.close();
		

	}

}
