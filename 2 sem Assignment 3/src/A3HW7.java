import java.util.*;
public class A3HW7 {
	public static void rearange(int []a, int high, int low, int k) {
		if(low < high) {
			int p = partition(a, low, high, k);
			rearange(a, low, p - 1, k);
			rearange(a, p + 1, high, k);
		}
	}
	public static int partition(int[] a, int low, int high, int k) {
		int pi = a[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++) {
			if(a[j] <= k) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i + 1, high);
		return i + 1;
	}
	public static void swap(int[]a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elments of array");
		int[]a = new int[8];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter k ");
		int k = sc.nextInt();
		 rearange(a, 0, a.length - 1, k);

	        // Print the array after rearrangement
	        System.out.println("Array after rearrangement:");
	        for (int i : a) {
	            System.out.print(i + " ");
	        }
	}

}
