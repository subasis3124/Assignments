import java.util.*;
public class A3Q6 {
	 public static <T> int count(T[] array, T item) {
		 int count = 0;
		 for(int i = 0; i < array.length; i++) {
			 if(array[i].equals(item)) {
				 count++;
			 }
		 }
		 return count;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double [] arr = new Double [5];
		System.out.println("enterr the element of the array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		System.out.println("enter the element of search");
		double item = sc.nextDouble();
		int c = count(arr,item);
		System.out.println("number of time " + item + " item present in the array " + c);
		Integer[] arr1 = new Integer[3];
		System.out.println("enter the element of the array");
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter the element of search");
		int item1 = sc.nextInt();
		c = count(arr1, item1);
		System.out.println("no of item present " + item1 + " present in the array " + c);
		

	}

}
