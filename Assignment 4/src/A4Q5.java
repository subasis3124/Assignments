import java.util.Scanner;
public class A4Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();
		int sum = 0, i = 0;
		for(i = 1; i < n; i++) {
			if(n%i == 0) {
				sum = sum + i;
			}
		}
		if(sum == n) {
			System.out.println("its a perfect number");
		}else
			System.out.println("not a perfect number");
		
		
		

	}

}
