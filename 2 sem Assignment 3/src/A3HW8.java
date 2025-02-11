import java.util.*;
public class A3HW8 {
	public static void hanoi(int n, char p1, char p2, char p3) {
	if(n == 1) {
		System.out.println("move 1 peg to " + p1 + " to peg " + p2);
		return;
	}
	hanoi(n - 1, p1 , p3, p2);
	System.out.println("move disk " + n + " from peg " + p1 + " to peg " + p3);
	hanoi(n - 1, p3, p2, p1);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of peg ");
		int n = sc.nextInt();
		
		hanoi(n , 'A', 'C', 'B');

	}

}
