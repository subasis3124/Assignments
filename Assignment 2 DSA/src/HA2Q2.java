import java.util.*;
class book {
	String bname;
	String bedition;
	int bprice;
	book(String bname,String bedition, int bprice) {
		this.bname = bname;
		this.bedition = bedition;
		this.bprice = bprice;
	}
	void display() {
		System.out.println("Book name is " + bname);
		System.out.println("Edittion of Book is " + bedition);
		System.out.println("price of the book is " + bprice);
	}
}
public class HA2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b[] = new book[5];
		b[0] = new book("dsa" , "7e" , 1200);
		b[1] = new book("calc" , "6e" , 600);
		b[2] = new book("itw" , "9e" , 500);
		b[3] = new book("upem" , "6e" , 900);
		b[4] = new book("igt" , "4e" , 800);
		
		System.out.println("detail of the bok having maximum price is" );
		//System.out.println("bname \t bedition \t bprice");
		int mp = 0;
		for(int i = 1; i < 5; i++) {
			if(b[i].bprice > b[mp].bprice)
				mp = i;
			}
		     b[mp].display();
		}
		
		

	}


