/* By
 * Subasis Mishra
 * 28
 * 2341013212
 */
import java.util.*;
class MarkOutOfBoundException extends Exception {
	MarkOutOfBoundException(String str){
		super(str);
	}
}
public class Student {
	public static void cheakMark(int mark, String name)throws MarkOutOfBoundException {
		if(mark > 100)
			throw new MarkOutOfBoundException("mark cannot be more than 100");
		else {
			System.out.println("Entered mark is valid");
		}
	}

	public static void main(String[] args)throws MarkOutOfBoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name and mark");
		String name = sc.next();
		int mark = sc.nextInt();
		try {
			cheakMark(mark,name);
		}
		catch(MarkOutOfBoundException obj) {
			System.out.println(obj);
		}
		finally {
			sc.close();
		}
		

	}

}
