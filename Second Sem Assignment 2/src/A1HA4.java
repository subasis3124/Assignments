import java.util.*;
public class A1HA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of rows and column");
		int r = sc.nextInt();
		int c = sc.nextInt();
		double m1[][] = new double [r] [c];
		System.out.println("enter element of matrix 1");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				m1 [i] [j] = sc.nextDouble();
			}
		}
		double m2 [] [] = new double [r][c];
		System.out.println("enter element of martix 2");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				m2 [i] [j] = sc.nextDouble();
			}
		}
		double m3 [][] = new double [r][c];
		System.out.println("enter element of matrix 3 ");
		m3 = addMatrix(m1,m2);
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
			}
			System.out.println(m3 [r][c] + " ");
		}
		System.out.println();
	}
	public static double[][] addMatrix(double [][]r, double [][]c) {
		int row = r.length;
		int column = r[0].length;
		double sum [][] = new double [row] [column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				sum[i][j] = r[i][j] + c[i][j];
			}
		}
		return sum;
	}

}
