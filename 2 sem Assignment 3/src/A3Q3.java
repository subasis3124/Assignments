import java.util.*;
class MarksOutOfBoundException extends Exception {
	 MarksOutOfBoundException(String str){
		 super(str);
	 }
}

class student {
	String name;
	int mark;
	
	public student(String name, int mark) throws MarksOutOfBoundException {
	    if (mark > 100) {
	        throw new MarksOutOfBoundException("Marks cannot be greater than 100.");
	    }
	    this.name = name;
	    this.mark = mark;
	}

	void display() {
		System.out.println("mark = " + mark);
		System.out.println("name is " + name);
	}
}
public class A3Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name of the student");
		String name = sc.nextLine();
		System.out.println("enter mark of the student");
		int mark = sc.nextInt();
		try {
			student s = new student(name,mark);
			s.display();
		} catch( MarksOutOfBoundException e) {
			System.out.println("exception" + e.getLocalizedMessage());
		}

	}

}
