import java.util.Scanner;
public class A4Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int gcd;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int n = sc.nextInt();
        System.out.println("enter 2nd number");
        int n2 = sc.nextInt();
        int a = n, b = n2;
        do {
            gcd = a%b;
        	a = b;
        	b = gcd;
        			
       }
        while(a%b != 0);
       System.out.println("gcd = " + gcd );
      
			}

}
