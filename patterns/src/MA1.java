import java.util.*;
public class MA1 {
    public static void main(String[] args) {
    	int sum = 0, square_sum = 0 , S_sum=0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			S_sum= sum*sum;
			square_sum += i * i;
			int new_sum= sum*sum;
		}
		System.out.println("The sum of the squares of the first  10 natural numbers is: " + square_sum);
		System.out.println("The square of the sum of the first 10 natural numbers is: " + S_sum);
		System.out.println(
				"Hence the difference between the sum of the squares of the first 10 natural numbers and the square of the sum is "
						+ S_sum + " - " +square_sum+ " = " + (S_sum-square_sum));

	}


    }

