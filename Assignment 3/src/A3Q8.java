import java.util.Scanner;
public class A3Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the x cordinate");
		double x = sc.nextDouble();
		
		System.out.println("enter y cordinate");
		double y = sc.nextDouble();
	
		if(x>0 && y>0) {
			System.out.println("(" + x +" , " + y +") is in first quadrant ");
		}else if(x<0 && y>0) {
			System.out.println("(" + x +" ," + y + ")is in second quadrant ");
		}else if(x<0 && y<0) {
			System.out.println("(" + x +" ," + y + ") is in third quadrant ");
		}else if(x>0 && y<0) {
			System.out.println("(" + x +" ," + y + ")is in fourth quadrant ");
		}else if (x == 0 && y != 0) {
			System.out.println("("+ x +" ," + y + ") is in x axis ");
		}else if (x != 0 && y == 0) {
			System.out.println("("+ x +" ," + y + ") is in y axis");
		}else 
			System.out.println(" 404 not found");
	}
}
