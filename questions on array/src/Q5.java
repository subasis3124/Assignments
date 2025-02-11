//Write a program that creates integer array of 10 elements, 
//accepts values of arrays and Find sum of all odd numbers
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sod = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number ");
		int a[] = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}for(int k = 0; k < a.length; k++) {
			if(a[k] % 2 != 0) {
				sod = sod + a[k];
			}
		}
		System.out.println("sum of odd number in array are " + sod);

	}

}
