import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int arr[] = {1,2,3,5};
		int sum = 0; 
		int num = n *(n + 1) / 2;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(num - sum);

	}

}
