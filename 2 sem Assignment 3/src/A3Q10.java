import java.util.*;
public class A3Q10 {
	public static int fibbo(int n) {
		if(n == 0) {
			return 0;
		}else if (n == 1){
			return 1;
		}else {
		return (fibbo(n - 1) +fibbo(n - 2));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int n = sc.nextInt();
		System.out.println(fibbo(n));

	}

}
