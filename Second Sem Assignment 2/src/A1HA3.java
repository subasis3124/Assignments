import java.util.*;
public class A1HA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int brr[] = new int[n];
		System.out.println("element of arr ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("element of brr");
		for(int j = 0; j < n; j++) {
			brr[j] = sc.nextInt();
		}
		int crr[] = new int[n];
		System.out.println("element of crr is the dot product of arr and brr");
		for(int k = 0; k < n; k++) {
			crr[k] = arr[k] + brr[k];
			System.out.println(crr[k] + "  ");
		}

	}

}
