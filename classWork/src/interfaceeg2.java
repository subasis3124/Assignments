interface printable {
	void print();
}
interface showable {
	void print();
}
public class interfaceeg2 implements printable,showable {
    public void print() {
    	System.out.println(" dsa ");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceeg2 obj = new interfaceeg2();
		obj.print();

	}

}
