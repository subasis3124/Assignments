import java .util.*;
public class MA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a decimal number: ");
	        int decimalNumber = sc.nextInt();

	        System.out.print("Enter the target base (between 2 and 36): ");
	        int targetBase = sc.nextInt();

	        if (targetBase < 2 || targetBase > 36) {
	            System.out.println("Invalid target base. Please enter a base between 2 and 36.");
	            return;
	        }

	        String result = convertToAnyBase(decimalNumber, targetBase);

	        System.out.println("Decimal " + decimalNumber + " in base " + targetBase + ": " + result);

	        
	    }

	    public static String convertToAnyBase(int n, int b) {
	        if (b < 2 || b > 36) {
	            throw new IllegalArgumentException("Base must be between 2 and 36");
	        }

	        StringBuilder result = new StringBuilder();
	        while (n > 0) {
	            int remainder = n % b;
	            char digit = getDigit(remainder);
	            result.insert(0, digit);
	            n /= b;
	        }

	        return result.toString();
	    }

	    private static char getDigit(int remainder) {
	        if (remainder < 10) {
	            return (char) ('0' + remainder);
	        } else {
	            return (char) ('A' + remainder - 10);
	        }
	}

}
