/* By
 * Subasis Mishra
 * 28
 * 2341013212
 */
import java.util.*;
public class A3Q1 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        try {
	            System.out.println("Enter your lucky number: ");
	            int n = Integer.parseInt(sc.nextLine());
	            
	            if (n < 0) {
	                throw new NumberFormatException("Negative numbers are not allowed.");
	            }
	            
	            System.out.println("Your lucky number is: " + n);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input. Please enter a valid positive integer.");
	        } finally {
	            
	        }
	    }
	}
