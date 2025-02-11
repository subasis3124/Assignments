/* By
 * Subasis Mishra
 * 28
 * 2341013212
 */
public class NumberFormatExceptionHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		try {
			int a = Integer.parseInt(str);
		}
		catch(NumberFormatException obj) {
			System.out.println(obj);
		}
		System.out.println("c");
		System.out.println("Rest of code");

	}

}
