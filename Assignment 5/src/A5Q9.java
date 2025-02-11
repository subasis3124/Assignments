import java.util.*;
public class A5Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
     
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1 + i * i;
        }

        System.out.println("Sum of the series is: " + sum);
		

	}

}
