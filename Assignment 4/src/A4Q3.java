import java.util.Scanner;
public class A4Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		
		int n = sc.nextInt();
		int t = n;
		int sum = 0;
		
		
		do {
			int rand = 1+(int)(Math.random()*n);
			System.out.println(rand + " ");
			sum += rand;
			n--;
		}while (n>0);
		 double avg = sum / t;
		 System.out.println(avg + "average");
		
		
		

	}

}
