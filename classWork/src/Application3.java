
public class Application3 {
	class person {
		int id;
		String name;
		person(int id, String name){
			this.id = id;
			this.name = name;
		}
	}
	class Emp extends person {
		double sal;
		Emp(int id, String name, double sal) {
			super(id,name);
			this.sal = sal;
		}
		void display() {
			System.out.println(id + " \t " + name + " \t " + sal);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application3 a = new Application3(); 
		Emp obj = a.new Emp(1 , "ABC" , 900000);
		obj.display();
	}
}
