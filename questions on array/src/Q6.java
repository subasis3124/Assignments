//Write a program which takes in 10 values and creates another array 
//which has cubes of the values (or factorial) and prints it.
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your array number");
		int k[] = new int [10];
        int a[] = new int [10];
        int i = 0;
        for( i = 0; i < a.length; i++) {
        	a[i] = sc.nextInt();
        }
        for(int j = 0; j < a.length; j++) {
        	System.out.println(a[j]);
        	k[i] = a[i] * a[i] * a[i];
        	System.out.println(k[i]);
        }
	}

}