import java.util.*;
public class A5Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();
	        
	        int sum = 0;
	        int innerSum = 0;

	        for (int i = 1; i <= n; i++) {
	            innerSum += i;
	            sum += innerSum;
	        }

	        System.out.println("Sum of the series is: " + sum);

	}

}
