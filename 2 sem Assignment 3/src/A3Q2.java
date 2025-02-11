/* By
 * Subasis Mishra
 * 28
 * 2341013212
 */
public class A3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colour = {"red" ,"green","yellow","blue"};
		try {
		String color = colour[3];
		System.out.println("my favorite colour is " + color);
		}
		catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj);
		}try {
			String []arr = null;
			String color = arr[0];
			System.out.println("fav colour " + color);
		}catch(NullPointerException obj) {
			System.out.println("exception caught");
 		}
		
	}

}
