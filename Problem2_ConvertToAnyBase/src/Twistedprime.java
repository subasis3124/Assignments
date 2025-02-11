import java.util.*;
class employee {
	int id;
	String name;
	double salary;
	
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee id name and salary");
		id = sc.nextInt();
	    name = sc.next();
	    salary = sc.nextDouble();
	}
	void showdata() {
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("salary = " + salary);
	}
}

public class Twistedprime {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   employee[] p = new employee[5];
		   
		   for(int i = 0; i < 5; i++) {
			   System.out.println("enter detail for employee" + (i + 1) + ":");
			   p[i] = new employee();
			   p[i].getdata();
			   
		   }
		   employee hp = p[0];
		   for(int i = 0; i < 5; i++) {
			   if(p[i].salary > hp.salary) {
				   hp = p[i];
			   }
		   }
		   
		   System.out.println("highest paid = ");
		   hp.showdata();
	    }
	}