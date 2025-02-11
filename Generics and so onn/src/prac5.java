import java.util.*;
public class prac5 {
	public static <T> Boolean search(T[]array,T item) {
		if(array[i].equals(item)) {
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer arr1[] = new Integer[5];
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("enter array elements");
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter the element to search");
		int item1 = sc.nextInt();
		boolean res1 = search(arr1,item1);
		System.out.println(item1 + " is present in array " + res1);
		double [] arr2 = new double[5];
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("enter array elements");
			arr2[i] = sc.nextDouble();
		}
		System.out.println("enter the item to search");
		double item2 = sc.nextDouble();
		boolean res1 = search(arr2,item2);
		System.out.println(item2 + " is present in array " + res1);
	}

}
