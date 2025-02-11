class oper {
	void display1() {
		System.out.println(" soa ");
	}
	void display() {
		System.out.println(" iter ");
		this.display();
	}
}
public class thisTopic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oper obj = new oper();
		obj.display();

	}

}
