class a {
	int i = 10;
}
class b extends a {
	int i = 20;
	void show(int i) {
		System.out.println(this.i);
		System.out.println(super.i);
	}
}
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj = new b();
		obj.show(30);

	}

}
