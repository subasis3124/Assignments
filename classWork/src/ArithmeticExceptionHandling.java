/* By
 * Subasis Mishra
 * 28
 * 2341013212
 */
public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0 , c = 0;
		try {
			c = a / b;
		}
		catch(ArithmeticException obj) {
			System.out.println(obj);
		}
		System.out.println("c");
		System.out.println("Rest of code");

	}

}
