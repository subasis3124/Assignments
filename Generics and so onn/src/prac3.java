import java.util.*;
public class prac3 {
	public static <E> void printArray(E[] inputArray) {
		for(E element: inputArray) {
			System.out.println(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer [] arr = new Integer[5];
		System.out.println("enter array element");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("integer array contains");
		printArray(arr);
		 double arr1[] = new double[5];
		 System.out.println("enter array element");
		 for(int i = 0; i < arr.length; i++) {
			 arr1[i] = sc.nextDouble();
		 }
		 System.out.println("double array contain");
		 //printArray(arr1);

	}

}
