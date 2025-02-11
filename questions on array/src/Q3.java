/*Write a program that creates integer array of 10 elements,
accepts values of arrays and Find Sum,Average, Min, Max*/

import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your array");
        int a[] = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length;i++) {
        	a[i] = sc.nextInt();
        }System.out.println("array ");
        for(int j = 0; j < a.length; j++) {
        	System.out.println(a[j]);
        }
        for(int k = 0; k < a.length; k++) {
        	sum = sum + a[k];
        }System.out.println("sum = " + sum);
        System.out.println("average = " + sum / a.length);
        for(int l = 0; l < a.length; l++) {
        	if(a[l] < min) {
        		min = a[l];
        	}
        }
        System.out.println("minimum value = " + min );
        for(int m = 0; m < a.length; m++) {
        	if(a[m] > max) {
        		max = a[m];
        	}
        }
        System.out.println("maximum value is = " + max);
	}

}
