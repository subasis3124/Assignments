class Abc {
	int num;
	void input(int num) {
		this.num = num;
	}
	void display () {
		System.out.println(num);
	}
}
public class thisTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = new Abc();
		obj.input(10);
		obj.display();

	}

}
