import java.util.*;
class bank {
	String bankname;
	double depositamount;
	static double totalamount;
	void setbankname(String bankname) {
		this.bankname = bankname;
	}
	void setamount(double depositamount) {
		this.depositamount = depositamount;
	}
	void showdata() {
		System.out.println("Bank Name is " + bankname);
		System.out.println("Amount deposit is " + depositamount);
	}
	void showmindepo(bank b[]) {
		double mindepo = Integer.MAX_VALUE;
		String minbname = " ";
		for(int i = 0; i < 5; i++) {
			if(b[i].depositamount > mindepo)
				mindepo = b[i].depositamount;
	            minbname = b[i].bankname;		
		}
		System.out.println(minbname);
	}
}
public class HA2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b[] = new bank[5];
		for(int i = 0; i < 5; i++) {
			b[i] = new bank();
		}
		b[0].bankname = "sbi";
		b[0].depositamount = 12000;
		b[1].bankname = "hdfc";
		b[1].depositamount = 35000;
		b[2].bankname = "icici";
		b[2].depositamount = 2200;
		b[3].bankname = "union";
		b[3].depositamount = 69;
		b[4].bankname = "pnb";
		b[4].depositamount = 350;
		System.out.println("bankname \t depositamount");
		for(int i = 0; i < 5; i++) {
			b[i].showdata();
		}
		//System.out.println("total amount deposit " + bank.totalamount);
		//System.out.println("bank with less deposit is  = ");
		b[0].showmindepo(b);

	}

}
