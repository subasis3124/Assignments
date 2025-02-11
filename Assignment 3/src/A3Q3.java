import java.util.Scanner;
public class A3Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no.s ");
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x<y && y<z) {
			System.out.println("“Increasing order”");

	}   else if (x>y && y>z) {
		    System.out.println("“decreasing order”");
	}   else {
		    System.out.println("__ not increasing nor decreasing__");
	}


	}

}
