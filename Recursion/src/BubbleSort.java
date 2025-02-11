/* Subasis Mishra
 * 28
 * 2341013212
 */
import java.util.*;

public class BubbleSort {
	public static void bsort(int a[]) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length - 1 - i; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array of element");
        for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }
        System.out.println("array before sorting");
        for(int value : arr) {
        	System.out.print(value + " ");
        }
        System.out.println();
        
        bsort(arr);
        
        System.out.println("array after sorting");
        for(int value : arr) {
        	System.out.print(value + " ");
        }
        System.out.println();
        
	}
}  
