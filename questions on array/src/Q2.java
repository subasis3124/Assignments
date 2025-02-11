/*Write a program that creates integer array of 10 elements,
 accepts values of arrays and Print the array in reverse*/
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your numbers");
		int a[] = new int[10];                    // intialize array with length 10
		for(int i = 0; i < a.length;i++) {        // used for loop for user input
		    a[i] = sc.nextInt();
		}
		System.out.println("original array");      //print original array
		for(int j = 0; j < a.length;j++) {
			System.out.println(a[j] + " ");        
		}
		System.out.println("reverse array");
		for(int k = a.length-1; k >= 0; k--) {     //this for loop works for reversing array
			System.out.println(a[k] + " ");        //by a.length-1 means its counts the index
		}                                          //and then - 1 from it for counting 
		                               //this loop will works till the value of k is >= 0 
		                               // then decrement process.
				

	}

}
