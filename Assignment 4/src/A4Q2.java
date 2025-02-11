import java.util.Scanner;
public class A4Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int sum = 0;
		int n = sc.nextInt();
		
		while(n>0) {
			sum += n%10;
			n/=10;
		}
		if(sum % 9 == 0) {
		    System.out.println("divisible by 9");
		}else {
			System.out.println("not divisible 9");
		}
		

	}

}
