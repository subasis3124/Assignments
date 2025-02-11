abstract class mark {
	int markicp;
	int markdsa;
	double percentage;
	abstract void getpercentage() ;
}
class cse extends mark {
	int algodesign;
	public cse(int icp,int dsa,int algodesign) {
		this.markicp = markicp;
		this.markdsa = markdsa;
		this.algodesign = algodesign;
	}
	void getpercentage() {
		percentage = (markicp + markdsa + algodesign) / 3.0;
		System.out.println("percentage = " + percentage);
	}
}
class noncse extends mark {
	int engmechanics;
	public noncse(int icp, int dsa ,int engmechanics) {
		this.markicp = markicp;
		this.markdsa = markdsa;
		this.engmechanics = engmechanics;
	}
	void getpercentage() {
		percentage = (markicp + markdsa + engmechanics) / 3.0;
		System.out.println("percentage = " + percentage);
}
public class A2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cse obj = new cse(95,98,94);
		noncse obj1 = new noncse(85,87,92);
		obj.getpercentage();
		obj1.getpercentage();

	}
}
}
