import java.util.*;
public class A5HQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("enter your number");
	        double x = sc.nextDouble();
	        double t = 1,sum = 0;
	        int i = 0;
	        do {
	            sum = sum + t;
	            i = i + 2;
	            t = -t * x * x / (i * (i - 1));
	        }while (Math.abs(t) > 0.000001);
	        System.out.println(sum);

	}

}
