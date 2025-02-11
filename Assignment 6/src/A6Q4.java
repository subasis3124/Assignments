import java.util.*;
public class A6Q4 {
	public static int numberOfDaysInAYear(int a , int b) {
		return a - b;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1st year");
		int a = sc.nextInt();
		System.out.println("enter 2nd number");
		int b = sc.nextInt();
		
		int count = numberOfDaysInAYear(a , b) * 365;
        
		System.out.println("number of days between given years are " + count);
	}

}
