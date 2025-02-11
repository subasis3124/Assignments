import java.util.Scanner;
public class A4Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the 1st number");
		int fn = sc.nextInt();
		
		System.out.println("enter the 2nd number");
		int sn = sc.nextInt();
		
		System.out.println("enter the 3rd number");
		int tn = sc.nextInt();
		
		int sum = 0;
		System.out.println("number displayed ");
		for(int i = fn; i<= sn; i += tn) {
			System.out.println(i + " ");
			sum += i;
		}
		System.out.println("sum of the number is " + sum);
		

	}

}
