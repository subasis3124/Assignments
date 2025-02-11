import java.util.*;
public class A1HA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = new int [4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				arr[i][j] = (int) (Math.random() * 2);
			}
		}
		System.out.println("matrix -->");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("the largest row index " + largestrow(arr));
		System.out.println("the largest row index " + largestcolumn(arr));
	}   public static int largestrow(int[][]m) {
		int lr = 0;
		int temp = 0;
		for(int i = 0;i < m.length; i++) {
			int count = 0;
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] == 1)
					count++;
			}
			if(count > temp) {
				temp = count;
				lr = i;
			}
		}
		return lr;
	}
	public static int largestcolumn(int [][] m) {
		int lc = 0;
		int temp = 0;
		for(int col = 0; col < m[0].length; col++) {
			int count = 0;
			for(int row = 0; row < m.length; row++) {
				if(m[row][col] == 1)
					count++;
			}if(count > temp) {
				temp = count;
				lc = col;
			}
		}
		return lc;
	}

}
