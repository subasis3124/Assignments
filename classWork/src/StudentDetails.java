import java.util.*;
class student{
     String name;
     int roll;
     double marks;
     String branch;
     
     void getdata() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("enter the name");
    	 name = sc.nextLine();
    	 System.out.println("enter roll no. ");
    	 roll = sc.nextInt();
    	 System.out.println("enter marks ");
    	 marks = sc.nextDouble();
    	 System.out.println("enter ur branch");
    	 branch = sc.next();
    	
    	 
     }
     
     void display() {
    	 System.out.println("name is " + name);
    	 System.out.println("rollno. is " + roll);
    	 System.out.println("marks is " + marks);
    	 System.out.println("branch is " + branch);
     }
}

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj = new student();
		obj.getdata();
		obj.display();

	}

}
