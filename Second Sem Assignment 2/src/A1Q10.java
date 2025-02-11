import java.util.*;
public class A1Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double[][] a = new double[3][4]; 
		
		System.out.println("enter element for matrix");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextDouble();
			}
		}
		for(int j = 0; j < a[0].length; j++) {
			System.out.println("sum of column " + j + " : " + sumColumn(a,j));
		}

	}
	public static double sumColumn(double[][]m,int columnIndex) {
		double sum = 0;
		for(double[] row: m) {
			sum += row[columnIndex];
		}
		return sum;
	}

}
