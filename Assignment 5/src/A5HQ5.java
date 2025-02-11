import java.util.*;
public class A5HQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int a = 0, b = 1;
		System.out.println("fibonacci series is : ");
		if(n == 1) 
			System.out.println(a);
		else if (n == 2)
		System.out.println(a + "  " + b);
		else {
			System.out.println(a + "," + b);
		}
		for(int i = 3; i <= n; i++) {
			int sum = a + b;
			System.out.println(sum + " ");
			a = b;
			b = sum;
		}
			
		
		

	}

}
