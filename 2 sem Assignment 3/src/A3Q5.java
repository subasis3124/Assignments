import java.util.*;
public class A3Q5 {
	 public static < E > void printArray( E[] inputArray) {
		 for(E element : inputArray) {
			 System.out.print(element + " ");
		 }
		 System.out.println();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[5];
		System.out.println("enter the element of the array ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("array contain");
		printArray(arr);
		Double arr2[] = new Double[5];
		System.out.println("enter the element of array");
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextDouble();
		}
		System.out.println("array contain");
		printArray(arr2);

	}

}
