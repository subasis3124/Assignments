import java.util.*;
public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []a = {18,6,23,5,7,10,4,9,8};
		
		System.out.println("original array");
		for(int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		bsort(a);
		
		System.out.println("sorted array");
		for(int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
		

	}
	public static void bsort(int []a) {
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

}
