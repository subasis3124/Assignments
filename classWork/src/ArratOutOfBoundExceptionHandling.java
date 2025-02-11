/* By
 * Subasis Mishra
 * 28
 * 2341013212
 */
public class ArratOutOfBoundExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4];
		try {
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj);
		}
		System.out.println("c");
		System.out.println("rest of code");

	}

}
