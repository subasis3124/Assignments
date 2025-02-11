import java.util.*;
class employe {
	String name;
	int sal;
	employe(String n,int s) {
		name = n;
		sal = s;
	}void Display() {
		System.out.println("name = " + name + " sal = " + sal );
	}void salmax(employe []obj) {
		int k = 0,s = obj[0].sal;
		for(int i = 0; i < obj.length ; i++) {
			if(s < obj[i].sal) {
				
				k = i;
			}
		}
		System.out.println("information of person having max salary is ");
		obj[k].Display();
	}
}
public class EmployeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		employe[]obj = new employe[5]; // loop will work only for 5 times 
		for(int i = 0; i < obj.length; i++) {
			System.out.println("enter name and salary");
			String n = sc.nextLine();
			int s = sc.nextInt();
			sc.nextLine(); // addeed new line       for  consumes the new charecter after reading the salary.
		    obj [i] = new employe(n , s);
			obj[i].Display();
			}
		    employe employe = new employe("",0);  //added create an instances to call salmax method..
		    employe.salmax(obj);
	
	}

}
