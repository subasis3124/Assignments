import java.util.Scanner;
public class A5Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;
		for (int i=2;i<=n;i++) {
	        if (n%i==0) {
	            System.out.println("Entered number is not prime\n");
	            break;
	        }
	        else {
	            System.out.println("Entered number is prime\n");
	            break;
	        }

	}

	}
}
