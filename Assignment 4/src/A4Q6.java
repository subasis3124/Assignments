import java.util.Scanner;
public class A4Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your 1st number");
        int a = sc.nextInt();
        System.out.println("enter your 2nd number");
        int b = sc.nextInt();
        int prod = 1;
        while(b>0) {
        	prod = prod * a;
        	b--;
        }
        System.out.println("product = " + prod );
	}

}
