
import java.util.*;
public class A1Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row");
		int r = sc.nextInt();
		System.out.println("enter column");
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		System.out.println("enter the element");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt(); 
			}
		}
		arrandsum(arr);

	}
	public static void arrandsum(int[][] arr) {
		System.out.println("array in tabular form");
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
			}
			System.out.println();
		}
		System.out.println("sum " + sum);
	}

}
