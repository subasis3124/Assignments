import java.util.*;
public class A1Q9 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int r = sc.nextInt();
		int c = sc.nextInt();
		double[][] matr = new double [r][c];
		for(int i = 0; i < matr.length; i++) {
			for(int j = 0; j < matr[0].length; j++) {
				matr[i][j] = sc.nextDouble();
			}
		}
		System.out.println("element of array are");
		for(int i = 0; i < matr.length; i++) {
			for(int j = 0; j < matr[0].length; j++) {
				System.out.print(matr[i][j] + "\t");
			}
		}
		double ds = sumMajorDiagonal(matr);
		System.out.println("sum " + ds);

	}public static double sumMajorDiagonal(double[][]m) {
		double sum = 0;
		for(int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}

}
