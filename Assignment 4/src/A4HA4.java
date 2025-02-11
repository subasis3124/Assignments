import java.util.Scanner;
public class A4HA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
	    int sum = 0;
	    int pro = 1;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
			   sum += i;
			}
			else {
				pro *= i;
			}
			System.out.println(" sum " + sum + " product " + pro);
		}

	}

}
