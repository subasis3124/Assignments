import java.util.*;
class MarkOutOfBoundException extends Exception {
	MarkOutOfBoundException(String str) {
		super(str);
	}
}

public class student2 {
	public static void cheakMark(int mark) throws MarkOutOfBoundException {
		if(mark > 100) {
			throw new MarkOutOfBoundException("mark cant more than 100");
		}else {
			System.out.println("good keep it up");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int m = sc.nextInt();
		try {
			cheakMark(m);
			}
			catch(MarkOutOfBoundException obj) {
				System.out.println(obj);
			}finally {
				sc.close();
			}
		}

}