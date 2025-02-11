/* By
 * Subasis Mishra
 * 28
 * 2341013212
 */
public class NullPointerExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException obj) {
			System.out.println(obj);
		}
		System.out.println("c");
		System.out.println("rest of code");

	}

}
