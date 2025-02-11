/*Write a program that creates integer array of 10 elements,
accepts values of arrays and then displays the values.*/

import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array element");
		int a[] = new int[10] ;
		for(int i = 0;i < a.length; i++) 
			a[i] = sc.nextInt();
		System.out.println("array = " );
		for(int j = 0; j < a.length; j++) 
			System.out.println(a[j]);
			

	}

}
